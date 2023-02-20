package com.example.bt1.controller;

import com.example.bt1.model.Blog;
import com.example.bt1.model.Type;
import com.example.bt1.service.IBlogService;
import com.example.bt1.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.print.Pageable;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    IBlogService service;
    @Autowired
    ITypeService typeService;
    @ModelAttribute("typeList")
    public List<Type> type(){
        return typeService.findAll();
    }
    @GetMapping("/blog")
    public String showList(Model model){
        List<Blog> blogList = service.findAll();
        model.addAttribute("listBlog", blogList);
        return "views/listBlog";
    }
    @GetMapping("/blog/create")
    public String showFormCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "views/create";
    }
    @PostMapping("/blog/create")
    public String save(@ModelAttribute Blog blog, Model model, RedirectAttributes attributes){
        service.save(blog);
        model.addAttribute("listBlog", service.findAll());
        return "redirect:/blog";
    }
    @GetMapping("/blog/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("blog", service.findById(id));
        return "views/edit";
    }

    @PostMapping("/blog/edit")
    public String edit(@ModelAttribute Blog blog){
        service.save(blog);
        return "redirect:/blog";
    }
    @GetMapping("/blog/detail/{id}")
    public String detail(@PathVariable int id, Model model){
        model.addAttribute("blog", service.findById(id));
        return "views/detail";
    }
    @GetMapping("/blog/delete/{id}")
    public String delete(@PathVariable int id){
        service.deleteById(id);
        return "redirect:/blog";
    }
}
