package com.services.hotels;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.allmyles.hotels.search.SearchRequest;
import com.resources.hotels.HotelSearchResource;
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

public class HotelSearchServiceTest {

    private MockMvc mockMvc;

    @Mock
    private HotelSearchService hotelSearchService;

    @InjectMocks
    private HotelSearchResource hotelSearchController;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(hotelSearchController)
                .build();
    }

    @Test
    public void searchHotels() throws Exception {

        SearchRequest search = new SearchRequest("LON", 1, "2017-09-29", "2017-09-30", "HU");
        hotelSearchService.searchHotels(search);

        mockMvc.perform(
                post("/hotels/search")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(search)))
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