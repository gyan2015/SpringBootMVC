package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationController {
 
@GetMapping("/")
    public String landingPage(Model model) {
       return "landing";
    }
 
@PostMapping("/welcome")
  public String welcome(@RequestParam("name") String name, Model model) {
     model.addAttribute("name", name);
     return "welcome";
  }
 
}
