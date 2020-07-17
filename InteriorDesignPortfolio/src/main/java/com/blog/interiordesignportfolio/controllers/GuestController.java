/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.interiordesignportfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestController {
    
    @GetMapping("/")
    public String displayHome() {
        return "home";
    }
    
    @GetMapping("/about")
    public String displayAbout(){
        return "about";
    }
    
    @GetMapping("/portfolio")
    public String displayPortfolio(){
        return "portfolio";
    }
    
    @GetMapping("/contact")
    public String displayContact(){
        return "contact";
    }
            
}
