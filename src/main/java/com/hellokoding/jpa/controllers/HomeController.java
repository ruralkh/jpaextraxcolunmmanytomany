package com.hellokoding.jpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create By: Ron Rith
 * Create Date on: 12/12/2018.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    private String goHome(){
        return "home";
    }
}

