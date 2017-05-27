package com.services.cars;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.allmyles.cars.search_cars.request.SearchCars;
import com.resources.cars.CarResource;
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
public class CarServiceTest {


    private MockMvc mockMvc;

    @Mock
    private CarService carService;

    @InjectMocks
    private CarResource carController;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(carController)
                .build();
    }

    @Test
    public void searchCars() throws Exception {

        SearchCars car = new SearchCars("LHR", "2017-07-01T10:00:00Z", "2017-07-04T10:00:00Z");
        carService.searchCars(car);

        mockMvc.perform(
                post("/cars/search")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(car)))
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