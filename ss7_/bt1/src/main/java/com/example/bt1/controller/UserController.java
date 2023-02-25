package com.example.bt1.controller;

import com.example.bt1.dto.UserDto;
import com.example.bt1.model.User;
import com.example.bt1.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    IUserService service;

    @GetMapping("/user")
    public String showList(Model model){
        List<User> userList = service.findAll();
        model.addAttribute("listUser", userList);
        return "views/list";
    }
    @GetMapping("/user/create")
    public String showFormCreate(Model model){
        model.addAttribute("userDto", new UserDto());
        return "views/create";
    }
    @PostMapping("/user/create")
    public String save(@Validated  @ModelAttribute UserDto userDto, BindingResult bindingResult, Model model, RedirectAttributes attributes){
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "views/create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        service.save(user);
        model.addAttribute("listUser", service.findAll());
        return "redirect:/user";
    }
    @GetMapping("/user/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("userDto", service.findById(id));
        return "views/edit";
    }

    @PostMapping("/user/edit")
    public String edit(@Validated  @ModelAttribute UserDto userDto, BindingResult bindingResult){
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "views/create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        service.save(user);
        return "redirect:/user";
    }
    @GetMapping("/user/detail/{id}")
    public String detail(@PathVariable int id, Model model){
        model.addAttribute("user", service.findById(id));
        return "views/detail";
    }
    @GetMapping("/user/delete/{id}")
    public String delete(@PathVariable int id){
        service.deleteById(id);
        return "redirect:/user";
    }
}
