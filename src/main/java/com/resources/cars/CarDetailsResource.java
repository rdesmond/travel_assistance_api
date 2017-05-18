package com.resources.cars;

import com.apis.APIResponse;
import com.models.allmyles.cars.get_car_details.request.Details;
import com.services.cars.CarDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yovaliceroman on 5/15/17.
 */

@RestController
@RequestMapping("/cars")
public class CarDetailsResource {

    @Autowired
    CarDetailsService carDetailsService;

    @RequestMapping(method = RequestMethod.POST, value = "/details")
    public APIResponse getCarDetails(@RequestBody Details carDetails) {
        APIResponse apiResponse = new APIResponse();
        try {
            apiResponse.setBody(carDetailsService.getCarDetails(carDetails));
            apiResponse.setStatus(HttpStatus.OK);
        }catch (Exception e){
            apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            apiResponse.setMessage("Unable to retrive cars details " + e.getMessage());
        }

        return apiResponse;
    }
}
