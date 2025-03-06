package com.example.learn.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MyErrorController implements ErrorController {
    @GetMapping("/error")
    public String handleError(HttpServletRequest request){

        Object errorcode= request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        return errorcode == null ? "error":"error-"+Integer.valueOf(errorcode.toString());
    }
}
