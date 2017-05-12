package com.services.cars;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.cars.search_cars.request.Filters;
import com.models.allmyles.cars.search_cars.request.SearchCars;
import com.models.allmyles.cars.search_cars.response.CarResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 5/11/17.
 */

@Service
public class CarService {

    @Autowired
        private GenericRequestHandler handler;

    public CarResults searchCars(String airport_code, String start_date, String end_date, String type){

        SearchCars search = new SearchCars();

        Filters filters = new Filters();

        filters.setType(new String[] {type});

        search.setAirport_code(airport_code);

        search.setStart_date(start_date);

        search.setEnd_date(end_date);

        search.setFilter(filters);

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-type", "application/json");
        headers.add("Cookie", "Cookie");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/cars", HttpMethod.POST);
        return (CarResults) handler.callAPI(request, search, CarResults.class, headers);
    }
}
