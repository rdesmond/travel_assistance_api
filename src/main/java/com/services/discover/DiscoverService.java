package com.services.discover;

import com.apis.APIResponse;
import com.mappers.DestinationMapper;
import com.mappers.TripMapper;
import com.models.allmyles.cars.search_cars.request.Filters;
import com.models.allmyles.cars.search_cars.request.SearchCars;
import com.models.allmyles.cars.search_cars.response.Car;
import com.models.allmyles.cars.search_cars.response.CarResults;
import com.models.internal.TripTag;
import com.models.internal.Destination;
import com.models.internal.Trip;
import com.services.DestinationService;
import com.services.cars.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cass
 */
@Service
public class DiscoverService {

    @Autowired
    DestinationMapper destinationMapper;

    @Autowired
    private CarService carService;

    @Autowired
    private APIResponse response;

    @Autowired
    private DestinationService service;

    /** This takes in a trip object and returns a list of possible destinations based on sub_region and tags
     *
     * I still need to figure out how to also return the information required to then book a trip
     *
     * @param tripRequest this is passed from the body of the request
     * @return an APIResponse with a list of possible destinations in the body
     */
    public APIResponse discoverDestinations(Trip tripRequest){
        // create an temporary list of all possible destinations
        List<Destination> possibleDestinations;
        //create a list to hold matching destinations
        List<Destination> matchingDestinations = new ArrayList<>();
        // turn tags into a List that can be iterated through
        List<TripTag> requestedTags = tripRequest.createTripTagList();
        try {
            //get possible destinations
            if (tripRequest.getSub_region() != null) {
                //get all the destinations in the requested region
                possibleDestinations = service.getBySubRegion(tripRequest.getSub_region());
            }else {
                //get all destinations
                possibleDestinations = service.getAll();
            }
            //iterate through the possible destinations and determine if any tags match
            for (Destination x : possibleDestinations){
                List<TripTag> destinationTags = x.createTripTagList();
                //removes any tags that do not match those requested
                destinationTags.retainAll(requestedTags);
                //if there are no matches, the destination is removed from the list
                if (destinationTags.size() >= 1){
                    matchingDestinations.add(x);
                }
            }
            // set response
            response.setBody(matchingDestinations);
            response.setStatus(HttpStatus.OK);
        }catch (Exception readError) {
            // set APIResponse status and message
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage("Unable to process request: "+ readError.getMessage());
        }
        // return APIResponse object to resource
        return response;
    }


    public APIResponse discover(Trip trip){
        List<Destination> destinations = new ArrayList<>();
        //in the future this should take in multiple destinations
        //we would run this logic for each destination and return all the trips
        String destination = trip.getDestinations().get(0).getName();
        String[] iata = destinationMapper.getIATA(destination);
        SearchCars searchCars = new SearchCars(iata[0], trip.getStart_date().toString(), trip.getEnd_date().toString());
        Filters filters = new Filters();
        String[] filtersType = new String[1];
        if (trip.getValue() == 1) {
            filtersType[0] = "2 door car";
            filters.setType(filtersType);
            searchCars.setFilter(filters);
        }
        else if (trip.getLuxury() == 1) {
            filtersType[0] = "sport";
            filters.setType(filtersType);
            searchCars.setFilter(filters);
        }
        else {
            filtersType[0] = "crossover";
            filters.setType(filtersType);
            searchCars.setFilter(filters);
        }
        CarResults cars = carService.searchCars(searchCars);
        List<Car> carList = new ArrayList<>();
        List<Trip> tripList = new ArrayList<>();
        for(int x = 0; x < 3; x++) {
            Trip temp = new Trip();
            temp.setCar(carList.get(x));
            tripList.add(temp);
        }
        response.setBody(tripList);
        return response;
    }




}
