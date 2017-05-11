package com.services.users;

import com.mappers.UserMapper;
import com.models.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Contains any business logic and calls the mapper methods for User
 * @author cass
 */
@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    //Create
    public User addNew(User user){
        mapper.addNew(user);
        return mapper.getById(user.getId());
    }

    //Read
    public ArrayList<User> getAll(){
        return mapper.getAll();
    }
    public User getById(int id){
        return mapper.getById(id);
    }

   //Update
   public User updateById(User user){
       int id = mapper.updateById(user);
       return mapper.getById(id);
   }

   //Delete
    public String deleteById(int id){
        int result = mapper.deleteById(id);
        if (result > 0)
            return "successfully deleted User Id " + id;
        else
            return "failed to delete User Id " + id;
    }
}
