package com.chandra.springboot.restful.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController
{
    @GetMapping("/")
    public String list(){
        return "products";
    }
}
