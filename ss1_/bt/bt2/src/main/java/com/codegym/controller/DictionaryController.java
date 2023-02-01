package com.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Array;
import java.util.ArrayList;

@Controller
public class DictionaryController {

    @GetMapping("dictionary")
    public String showList(Model model){
        return "dictionary";
    }

    @PostMapping("dictionary")
    public String save(@RequestParam String word, Model model){
        String rpWord = "không tìm thấy từ đã nhập";
        String[] eng = {"do", "work", "interview", "see"};
        String[] vn = {"làm", "làm việc", "phỏng vấn", "xem"};
        for (int i = 0; i < eng.length; i++) {
            if (word.equals(eng[i])) {
                rpWord = vn[i];
            }
        }
        model.addAttribute("rpWord",rpWord);
        return "dictionary";
    }
}
