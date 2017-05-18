package com.resources.common.payment;

import com.apis.APIResponse;
import com.models.allmyles.common.payment.Payment;
import com.services.common.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yovaliceroman on 5/15/17.
 */

@RestController
@RequestMapping("/payment")
public class PaymentResource {

    @Autowired
    PaymentService paymentService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse paymentCommon(@RequestBody Payment payments) {
        APIResponse apiResponse = new APIResponse();
        try {
            apiResponse.setBody(paymentService.paymentCarsHotels(payments));
            apiResponse.setStatus(HttpStatus.OK);
        }catch (Exception e){
            apiResponse.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            apiResponse.setMessage("Unable to retrive payment information" + e.getMessage());
        }
        return apiResponse;
    }
}
