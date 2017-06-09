package com.services.cars;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.cars.search_cars.request.SearchCars;
import com.models.allmyles.cars.search_cars.response.Car;
import com.models.allmyles.cars.search_cars.response.CarResults;
import com.models.internal.TripCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yovaliceroman on 5/11/17.
 */

@Service
public class CarService {

    @Autowired
        private GenericRequestHandler handler;

    public CarResults searchCars(SearchCars car){

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-Type", "application/json");
        headers.add("Cookie", "Cookie");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/cars", HttpMethod.POST);
        return (CarResults) handler.callAPI(request, car, CarResults.class, headers);
    }

    public List<Car> filterCars(CarResults carResults) {
        //need to add sorting method to return specific results
        List<Car> results = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            results.add(carResults.getCar_results()[i]);
        }
        return results;
    }
}
