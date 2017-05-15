package com.services.cars;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.cars.get_car_details.request.Details;
import com.models.allmyles.cars.get_car_details.response.DetailsResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 5/15/17.
 */

@Service
public class CarDetailsService {

    @Autowired
    private GenericRequestHandler handler;

    public DetailsResults getCarDetails(String vehicle_id){
        Details details = new Details();

        details.setVehicle_id(vehicle_id);

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-Type", "application/json");
        headers.add("Cookie", "Cookie");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/cars", HttpMethod.GET);
        return (DetailsResults) handler.callAPI(request, details, DetailsResults.class, headers);
    }
}
