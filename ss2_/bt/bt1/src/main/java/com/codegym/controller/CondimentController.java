package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/condiment")
public class CondimentController {
    List<String> chooseCondimentList = new ArrayList<>();

    @GetMapping("/choose")
    public String showOption() {
        return "choose";
    }

    @PostMapping("/saved")
    public String save(@RequestParam(value = "condiment",required = false,defaultValue = "")String[] condiment,Model model) {
        if (condiment.length == 0) {
            model.addAttribute("mess", "Just sandwich, no condiment");
        }else {
            model.addAttribute("mess", "The sandwich have condiment:");
            model.addAttribute("condimentList",condiment);
        }
        return "list";
    }
}
