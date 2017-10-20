package com.bl.vote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {

    @RequestMapping("/")
    public String home(){
        return "redirect:/lock.html"; 
    }
}
