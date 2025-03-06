package com.example.learn.demo.controller;

import com.example.learn.demo.dto.APIResponse;
import com.example.learn.demo.dto.User;
import com.example.learn.demo.service.UserService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MyRestController {

    @Autowired
    UserService userService;


   // User user;
    @GetMapping("/home")
    public String getResult(@RequestParam(value="continue", required = false) String s){
       // request.getParameter("name");
        System.out.println("in get mapping "+s);

        return "success";
    }

    @GetMapping("/health")
    public String appStatus(HttpServletRequest request){

        return "health";
    }

    @GetMapping("/users")
    public ResponseEntity<APIResponse> getUserDetails(){
        List<User> userList =
                userService.getUserList();
        return new ResponseEntity<>(APIResponse.builder().results(userList).status(String.valueOf(HttpStatus.OK)).build(), HttpStatus.OK);
    }

    @GetMapping("/users/role")
    public ResponseEntity<APIResponse> getUserByRole(@RequestParam(required = false) String role){
        List<User> adminUserLst =
        userService.getUserList().stream().filter(user -> user.getRole().equalsIgnoreCase(role)).collect(Collectors.toList());
        return new ResponseEntity<>(APIResponse.builder().results(adminUserLst).build(), HttpStatus.OK);
    }
}
