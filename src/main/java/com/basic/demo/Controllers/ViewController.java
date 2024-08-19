package com.basic.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot WAR deployment!");
        return "home";
    }

    @GetMapping("/hey")
    public String hey() {
        return "home";
    }
}
