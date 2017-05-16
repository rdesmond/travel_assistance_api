package com.services.common.booking;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.common.booking.request.Booking;
import com.models.allmyles.common.booking.response.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 5/16/17.
 */

@Service
public class BookingService {

    @Autowired
    private GenericRequestHandler handler;

    public BookingResponse bookingCarsHotels(Booking bookings){

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-Type", "application/json");
        headers.add("Cookie", "Cookie");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/books", HttpMethod.POST);
        return (BookingResponse) handler.callAPI(request, bookings, BookingResponse.class, headers);
    }

}
