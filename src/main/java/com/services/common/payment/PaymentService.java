package com.services.common.payment;

import com.apis.GenericRequestHandler;
import com.apis.ThirdPartyRequest;
import com.models.allmyles.common.payment.request.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 5/15/17.
 */

@Service
public class PaymentService {

    @Autowired private GenericRequestHandler handler;

    public String payment(String payuId, String[] basket){

        Payment payment = new Payment();

        payment.setPayuId(payuId);
        payment.setBasket(basket);


        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Auth-Token", "af327616-9978");
        headers.add("Content-Type", "application/json");
        headers.add("Cookie", "Cookie");
        ThirdPartyRequest request = new ThirdPartyRequest(
                "https://dev.allmyles.com/v2.0/cars", HttpMethod.POST);

        return (String) handler.callAPI(request, payment, String.class, headers);
    }
}

