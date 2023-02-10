package com.codegym.controller;


import com.codegym.model.MedicalInfo;
import com.codegym.service.IMedicalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.util.ArrayList;

@Controller
@RequestMapping("/medicalInfo")
public class MedicalInfoController {
    @Autowired
    IMedicalInfoService medicalInfoService;
    MedicalInfo medicalInfo = new MedicalInfo();
    @ModelAttribute("year")
    public String[] year(){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1900; i <= 2023; i++) {
            list.add(String.valueOf(i));
        }
        return list.toArray(new String[0]);
    }
    @ModelAttribute("transport")
    public String[] transport(){
        return new String[]{"Tàu bay","Tàu thuyền","Ô tô","Khác (ghi rõ)"};
    }
    @GetMapping("/send")
    public String showMedicalEdit(Model model) {
        model.addAttribute("medicalInfo", new MedicalInfo());
        return "/send";
    }

    @PostMapping("/send-medical")
    public String save(@ModelAttribute MedicalInfo medicalInfo, Model model ) {
        model.addAttribute("medicalInfo", medicalInfoService.update(medicalInfo));
        return "/medicalInfo";
    }
}
