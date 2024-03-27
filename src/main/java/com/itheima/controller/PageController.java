package com.itheima.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class PageController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("pageTitle", "Welcome to My Website!");
        return "index"; // 返回 Thymeleaf 模板名称
    }
}
