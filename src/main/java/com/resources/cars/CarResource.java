package com.resources.cars;

import com.apis.APIResponse;
import com.models.allmyles.cars.search_cars.request.SearchCars;
import com.services.cars.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yovaliceroman on 5/11/17.
 */

@RestController
@RequestMapping("/cars")
public class CarResource {

    @Autowired
    CarService carService;

    @RequestMapping(method = RequestMethod.POST, value = "/search")
    public APIResponse searchCars(@RequestBody SearchCars car ) {
        APIResponse apiResponse = new APIResponse();
        try {
            apiResponse.setBody(carService.searchCars(car));
            apiResponse.setStatus(HttpStatus.OK);
        } catch (Exception e){
            apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            apiResponse.setMessage("Unable to retrive cars" + e.getMessage());
        }
        return apiResponse;
    }
}
