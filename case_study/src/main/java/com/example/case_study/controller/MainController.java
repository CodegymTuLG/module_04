package com.example.case_study.controller;

import java.security.Principal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.WebUtils;

@Controller
public class MainController {
    @RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        model.addAttribute("title", "Welcome");
        model.addAttribute("message", "This is welcome page!");
        return "welcomePage";
    }
    @RequestMapping(value = "/furama/login", method = RequestMethod.GET)
    public String loginPage(Model model) {
        return "loginPage";
    }
    @RequestMapping(value = "/furama/logout", method = RequestMethod.GET)
    public String logoutSuccessfulPage(Model model) {
        model.addAttribute("title", "Logout");
        return "logout";
    }
    @RequestMapping(value = "/furama", method = RequestMethod.GET)
    public String homePage(){
        return "furama";
    }

}
