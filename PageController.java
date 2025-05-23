package com.author.bookman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("username", "Author"); // Replace with real username later
        return "dashboard";
    }

    @GetMapping("/editor")
    public String editorPage() {
        return "editor";
    }
}
