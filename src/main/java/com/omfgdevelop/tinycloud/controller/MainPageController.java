package com.omfgdevelop.tinycloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {


    @GetMapping("/")
    public String getMainPage(Model model) {
        return "index";
    }
}
