package com.codegym.controller;


import com.codegym.model.EmailConfig;
import com.codegym.responsitory.IEmailConfigResponsitory;
import com.codegym.service.IEmailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/email-config")
public class EmailConfigController {
    @Autowired
    IEmailConfigService emailConfigService;
    EmailConfig emailConfig = new EmailConfig();
    @ModelAttribute("languages")
    public String[] showOptionLanguage(){
        return new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
    }
    @ModelAttribute("pageSizes")
    public String[] showOptionPageSize(){
        return new String[]{"5", "10", "15", "20", "25", "50", "100"};
    }
    @GetMapping("/edit")
    public String showSetting(Model model) {
        if (emailConfig.getPageSize() == null){
            emailConfig = new EmailConfig("English","5",true,"Thor");
        }
        model.addAttribute("emailConfig",emailConfig);
        return "/edit";
    }

    @PostMapping("/current-info")
    public String save(@ModelAttribute EmailConfig emailConfig, Model model ) {
        model.addAttribute("emailConfig", emailConfigService.update(emailConfig));
        return "/configInfo";
    }
}
