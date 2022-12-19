package com.example.wsserver.controller;

import com.example.wsserver.entity.user;
import com.example.wsserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class User {
    @Autowired
    private UserRepository userRepository;
    @CrossOrigin(origins = "*",maxAge = 3600)
    @GetMapping("/FindUser")
    public List<user> FindUser(){
        return userRepository.findAll();
    }

//    @PostMapping("RootLogin")
//    public user RootLogin(String UserName,String PassWord){
//        user ReturnData = new user(UserName,PassWord);
//        return ;
//    }
}
