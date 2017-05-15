package com.resources.common.payment;

import com.apis.APIResponse;
import com.services.common.payment.PaymentService;
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
@RequestMapping("/payment")
public class PaymentResource {

    @Autowired
    PaymentService paymentService;

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public APIResponse payment(@RequestParam(value="payuId") String payuId,
                               @RequestParam(value ="basket") String[] basket) {
        APIResponse apiResponse = new APIResponse();
        apiResponse.setBody(paymentService.payment(payuId, basket));
        apiResponse.setStatus(HttpStatus.OK);
        return apiResponse;
    }
}
