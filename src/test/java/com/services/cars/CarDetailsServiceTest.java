package com.services.cars;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.allmyles.cars.get_car_details.request.Details;
import com.resources.cars.CarDetailsResource;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by yovaliceroman on 5/27/17.
 */

public class CarDetailsServiceTest {

    private MockMvc mockMvc;

    @Mock
    private CarDetailsService carDetailsService;

    @InjectMocks
    private CarDetailsResource carDetailsController;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(carDetailsController)
                .build();
    }

    @Test
    public void getCarDetails() throws Exception {

        Details carDetails = new Details("3277345_0_0");
        carDetailsService.getCarDetails(carDetails);

        mockMvc.perform(
                post("/cars/details")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(carDetails)))
                .andExpect(status().isOk());

    }

    /**
     converts a Java object into JSON representation
     **/

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}