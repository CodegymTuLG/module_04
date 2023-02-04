package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/condiment")
public class CalculationController {
    List<String> chooseCondimentList = new ArrayList<>();

    @GetMapping("/calculation")
    public String showCalculation() {
        return "calculation";
    }

    @PostMapping("/calculation")
    public String save(@RequestParam(value = "num1", defaultValue = "false")double num1, @RequestParam(value = "num2", defaultValue = "false")double num2, @RequestParam()String method,Model model) {
        double result = 0;
        String mess = "";
        String num1String = String.valueOf(num1);
        String num2String = String.valueOf(num2);
        if(num1String.equals("false")||num2String.equals("false")){
            model.addAttribute("mess","let input true value!");
            return "calculation";
        }
        switch (method) {
            case "+":
                result = num1 + num2;
            break;
            case "-":
                result = num1 - num2;
            break;
            case "*":
                result = num1 * num2;
            break;
            case "/":
                if (num2 == 0) {
                    model.addAttribute("mess", "On this operator second Operand cant be ZERO");
                    return "calculation";

                } else {
                    result = num1 / num2;
                }
                break;
            default:
                model.addAttribute("mess","let input true value!");
                return "calculation";

        }
        model.addAttribute("mess",mess);
        model.addAttribute("result",result);
        return "calculation";
    }
}
