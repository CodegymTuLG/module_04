package com.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {
    @GetMapping("calculation")
    public String showCalculation(Model model){
        return "calculation";
    }

    @PostMapping("calculation")
    public String save(@RequestParam String usd, Model model){
        String vnd = String.valueOf(Double.parseDouble(usd) * 21000);
        model.addAttribute("vnd",vnd);
        return "calculation";
    }
}
