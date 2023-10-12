package com.example.springsecurityfinal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/")
    public String homeMethod(){
        return "<h1>Welcome boy</h1>";
    }

    @GetMapping("/admin")
    public String adminMethod(){
        return "<h1>Welcome admin</h1>";
    }
}
