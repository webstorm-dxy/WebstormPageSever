package com.example.wsserver.controller;

import com.example.wsserver.com.geta;
import com.example.wsserver.repository.MassageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/massage")
public class massage {
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/data")
    public String data(@RequestBody Map map, @ModelAttribute("geta") geta geta){
        System.out.println(map);
        String UserEmail = (String) map.get("email");
        String Massage = (String) map.get("massage");
        geta umassage = new geta();
        umassage.setMassage(Massage);
        umassage.setEmail(UserEmail);
//        MassageRepository.save(umassage);
        return "hello world";
    }
}
