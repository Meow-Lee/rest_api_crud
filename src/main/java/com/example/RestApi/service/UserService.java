package com.example.RestApi.service;

import com.example.RestApi.dao.UserRepository;
import com.example.RestApi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Map<String, String> getMessage(){
        Map<String,String> map = userRepository.getMessage();
        return map;
    }

    public List<User> getUsers(){
        return userRepository.getUsers();
    }

    public User getUserByUserId(Integer userid){
        return userRepository.getUserByUserId(userid);
    }

    public User registUser(User user){
        return userRepository.registUser(user);
    }

    public void modifyUser(User user){
        userRepository.modifyUser(user);
    }

    public void removeUser(Integer userid){
        userRepository.removeUser(userid);
    }
}
