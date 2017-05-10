package com.services.users;

import com.mappers.UserMapper;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;

/**
 * Contains any business logic and calls the mapper methods for User
 * @author cass
 */
public class UserService {

    @Autowired
    private UserMapper mapper;

    //Create
    public User addNew(Object user){
        int id = mapper.addNew(user);
        return mapper.getById(id);
    }

    //Read
    public ArrayList<User> getAll(){
        return mapper.getAll();
    }
    public User getById(int id){
        return mapper.getById(id);
    }

   //Update
   public User updateById(Object user){
       int id = mapper.updateById(user);
       return mapper.getById(id);
   }

   //Delete
    public String deleteById(int id){
        int result = mapper.deleteById(id);
        if (result > 0)
            return "successfully deleted " + id;
        else
            return "failed to delete " + id;
    }
}
