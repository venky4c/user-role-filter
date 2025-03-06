package com.example.learn.demo.service;

import com.example.learn.demo.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    User user;

    List<User> userList = new ArrayList<User>();
    public void addUser(User user){
        userList.add(user);
    }

    public List<User> getUserList(){
       return Arrays.asList(
               new User(1,"vasantha", "admin"),
               new User(2,"anitha", "fin"),
               new User(3,"kavitha", "acct"),
               new User(4,"sindhu", "dev")
       );
    }
}
