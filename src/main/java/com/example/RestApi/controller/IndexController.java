package com.example.RestApi.controller;

import com.example.RestApi.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController
public class IndexController {
/*
    //String 반환
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @GetMapping("/")
    public String index(){
        return "Hello, SpringBoot";
    }
*/
    @Autowired
    private UserService userService;
    //JSON 형태 반환
    @GetMapping("/")
    public Map<String, String> index(){
        Map<String, String> res = this.userService.getMessage();
        return res;
    }
}
