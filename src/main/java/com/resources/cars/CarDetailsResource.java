package com.resources.cars;

import com.apis.APIResponse;
import com.services.cars.CarDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 5/15/17.
 */

@RestController
@RequestMapping("/cars")
public class CarDetailsResource {

    @Autowired
    CarDetailsService carDetailsService;

    @RequestMapping(method = RequestMethod.POST, value = "/details")
    public APIResponse getCarDetails(@RequestParam(value="vehicle_id") String vehicle_id) {
        APIResponse apiResponse = new APIResponse();
        apiResponse.setBody(carDetailsService.getCarDetails(vehicle_id));
        apiResponse.setStatus(HttpStatus.OK);
        return apiResponse;
    }
}
