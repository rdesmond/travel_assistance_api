//package com.services.users;
//
//import com.models.User;
//import com.resources.users.UserResource;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.http.*;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import static org.hamcrest.Matchers.containsString;
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.core.Is.is;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
///**
// * Basically a copy of this guide: http://memorynotfound.com/unit-test-spring-mvc-rest-service-junit-mockito/
// *
// * These don't pass yet, I need to go through them and edit some logic from the example to fit out setup - So I've
// * annotated with @ignore
// *
//  * @author cass
// */
////@Ignore
//public class UserServiceTest {
//
//    private static final int UNKNOWN_ID = Integer.MAX_VALUE;
//
//    private MockMvc mockMvc;
//
//    @Mock
//    private UserService userService;
//
//    @InjectMocks
//    private UserResource userController;
//
//    @Before
//    public void init(){
//        MockitoAnnotations.initMocks(this);
//        mockMvc = MockMvcBuilders
//                .standaloneSetup(userController)
////                .addFilters(new CORSFilter()) //I don't have this class in the code
//                .build();
//    }
//
//    // =========================================== Get All Users ==========================================
//
//    @Test
//    public void test_get_all_success() throws Exception {
//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User(12668, "Daenerys", "Targaryen"));
//        users.add(new User(247648, "John", "Snow"));
//
//        when(userService.getAll()).thenReturn(users);
//
//        mockMvc.perform(get("/users/"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .andExpect(jsonPath("$.body", hasSize(2)))
//                .andExpect(jsonPath("$.body.[0].id", is(12668)))
//                .andExpect(jsonPath("$.body.[0].first_name", is("Daenerys")))
//                .andExpect(jsonPath("$.body.[0].last_name", is("Targaryen")))
//                .andExpect(jsonPath("$.body.[1].id", is(247648)))
//                .andExpect(jsonPath("$.body.[1].first_name", is("John")))
//                .andExpect(jsonPath("$.body.[1].last_name", is("Snow")));
//
//        verify(userService, times(1)).getAll();
//        verifyNoMoreInteractions(userService);
//    }
//
//    // =========================================== Get User By ID =========================================
//
//    @Test
//    public void test_get_by_id_success() throws Exception {
//        User user = new User(14236, "Daenerys", "Targaryen");
//
//        when(userService.getById(14236)).thenReturn(user);
//
//        mockMvc.perform(get("/users/{id}", 14236))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
//                .andExpect(jsonPath("$.body.id", is(14236)))
//                .andExpect(jsonPath("$.body.first_name", is("Daenerys")))
//                .andExpect(jsonPath("$.body.last_name", is("Targaryen")));
//
//        verify(userService, times(1)).getById(14236);
//        verifyNoMoreInteractions(userService);
//    }
//
//    @Test
//    public void test_get_by_id_fail_404_not_found() throws Exception {
//
//        when(userService.getById(14236)).thenReturn(null);
//
//        mockMvc.perform(get("/users/{id}", 14236))
//                .andExpect(status().isNotFound());
//
//        verify(userService, times(1)).getById(14236);
//        verifyNoMoreInteractions(userService);
//    }
//
//    // =========================================== Create New User ========================================
//
//    @Test
//    public void test_create_user_success() throws Exception {
//        User user = new User(2839876,"Arya", "Stark");
////        when(userService.exists(user)).thenReturn(false);
//        userService.addNew(user);
//
//        mockMvc.perform(
//                post("/users/")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(user)))
//                .andExpect(status().isOk());
////                .andExpect(header().string("location", containsString("http://localhost/users/")));
//
////        verify(userService, times(1)).exists(user);
//        verify(userService, times(1)).addNew(user);
////        verifyNoMoreInteractions(userService);
//    }
//
//    @Test
//    public void test_create_user_fail_409_conflict() throws Exception {
//        User user = new User("userId", "exists");
//
//        when(userService.exists(user)).thenReturn(true);
//
//        mockMvc.perform(
//                post("/users")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(user)))
//                .andExpect(status().isConflict());
//
//        verify(userService, times(1)).exists(user);
//        verifyNoMoreInteractions(userService);
//    }
//
//    // =========================================== Update Existing User ===================================
//
//    @Test
//    public void test_update_user_success() throws Exception {
//        User user = new User(2839,"Arya", "Stark");
//
//        when(userService.getById(user.getId())).thenReturn(user);
//        userService.updateById(user);
//
//        mockMvc.perform(
//                patch("/users/{id}", user.getId())
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(user)))
//                .andExpect(status().isOk());
//
//        verify(userService, times(1)).getById(user.getId());
//        verify(userService, times(1)).updateById(user);
//        verifyNoMoreInteractions(userService);
//    }
//
//    @Test
//    public void test_update_user_fail_404_not_found() throws Exception {
//        User user = new User(UNKNOWN_ID, "user","not found");
//
//        when(userService.getById(user.getId())).thenReturn(null);
//
//        mockMvc.perform(
//                put("/users/{id}", user.getId())
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(asJsonString(user)))
//                .andExpect(status().isNotFound());
//
//        verify(userService, times(1)).getById(user.getId());
//        verifyNoMoreInteractions(userService);
//    }
//
//    // =========================================== Delete User ============================================
//
//    @Test
//    public void test_delete_user_success() throws Exception {
//        User user = new User(1, "Arya", "Stark");
//
//        when(userService.getById(user.getId())).thenReturn(user);
//        userService.deleteById(user.getId());
//
//        mockMvc.perform(
//                delete("/users/{id}", user.getId()))
//                .andExpect(status().isOk());
//
//        verify(userService, times(1)).getById(user.getId());
//        verify(userService, times(1)).deleteById(user.getId());
//        verifyNoMoreInteractions(userService);
//    }
//
//    @Test
//    public void test_delete_user_fail_404_not_found() throws Exception {
//        User user = new User(UNKNOWN_ID, "user", "not found");
//
//        when(userService.getById(user.getId())).thenReturn(null);
//
//        mockMvc.perform(
//                delete("/users/{id}", user.getId()))
//                .andExpect(status().isNotFound());
//
//        verify(userService, times(1)).getById(user.getId());
//        verifyNoMoreInteractions(userService);
//    }
//
//    // =========================================== CORS Headers ===========================================
//
//    @Test
//    public void test_cors_headers() throws Exception {
//        mockMvc.perform(get("/users"))
//                .andExpect(header().string("Access-Control-Allow-Origin", "*"))
//                .andExpect(header().string("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE"))
//                .andExpect(header().string("Access-Control-Allow-Headers", "*"))
//                .andExpect(header().string("Access-Control-Max-Age", "3600"));
//    }
//
//    /*
//     * converts a Java object into JSON representation
//     */
//    public static String asJsonString(final Object obj) {
//        try {
//            return new ObjectMapper().writeValueAsString(obj);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}