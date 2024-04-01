package com.example.toDoList.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {

    @GetMapping("/admin")
    public String getMain() {
        return "admin/home";
    }

}
