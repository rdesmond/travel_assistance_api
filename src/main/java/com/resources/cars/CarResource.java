package com.resources.cars;

import com.apis.APIResponse;
import com.services.cars.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 5/11/17.
 */

@RestController
@RequestMapping("/cars")
public class CarResource {

    @Autowired
    CarService carService;

    @RequestMapping(method = RequestMethod.POST, value = "/search")
    public APIResponse searchCars(@RequestParam(value="airport_code") String airport_code,
                                  @RequestParam(value="start_date") String start_date,
                                  @RequestParam(value="end_date") String end_date,
                                  @RequestParam(value="type") String type) {
        APIResponse apiResponse = new APIResponse();
        apiResponse.setData(carService.searchCars(airport_code, start_date, end_date, type));
        apiResponse.setStatus(HttpStatus.OK);
        return apiResponse;
    }
}
