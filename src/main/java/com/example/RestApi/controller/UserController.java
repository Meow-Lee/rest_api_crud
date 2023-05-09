package com.example.RestApi.controller;

import com.example.RestApi.model.User;
import com.example.RestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userid}")
    public User getUserByUserId(@PathVariable("userid") Integer userid){
        return userService.getUserByUserId(userid);
    }

    @PostMapping("")
    public User registUser(@RequestBody User user){
        System.out.println(user);
        return userService.registUser(user);
    }

    @PutMapping("/{userid}")
    public void modifyUser(@PathVariable("userid") Integer userid,
                           @RequestBody User user){
        userService.modifyUser(user);
    }

    @DeleteMapping("/{userid}")
    public void removeUser(@PathVariable("userid") Integer userid){
        userService.removeUser(userid);
    }
}
