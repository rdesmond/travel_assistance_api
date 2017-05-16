package com.resources.common.booking;

import com.apis.APIResponse;
import com.models.allmyles.common.booking.request.Booking;
import com.services.common.booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 5/17/17.
 */

@RestController
@RequestMapping("/books")
public class BookingResource {

    @Autowired
    BookingService bookingService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse bookingCommon(@RequestBody Booking bookings ) {
        APIResponse apiResponse = new APIResponse();
        try {
            apiResponse.setBody(bookingService.bookingCarsHotels(bookings));
            apiResponse.setStatus(HttpStatus.OK);
        } catch (Exception e){
            apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            apiResponse.setMessage("Unable to book" + e.getMessage());
        }
        return apiResponse;
    }
}
