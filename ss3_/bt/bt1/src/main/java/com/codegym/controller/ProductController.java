package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping("/list")
    public String showList(ModelMap model){
        model.addAttribute("productList", productService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
     model.addAttribute("product", new Product());
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Product product, Model model, RedirectAttributes attributes){
        productService.save(product);
        model.addAttribute("productList", productService.findAll());
        attributes.addFlashAttribute("mess","them moi thanh cong");
        return "redirect:/product/list";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        int index = 0;
        List<Product> productList = productService.findAll();
        for (int i = 0; i < productList.size(); i++) {
            if (id==productList.get(i).getId()){
                index = i;
            }
        }
        model.addAttribute("indexNum", index);
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/edit/{indexNum}")
    public String edit(@ModelAttribute Product product,@PathVariable int indexNum, Model model){
        productService.edit(product, indexNum);
        model.addAttribute("product", productService.findAll());
        return "redirect:/product/list";
    }
    @GetMapping("/search")
    public String searchByName(@RequestParam String nameSearch, Model model){
        model.addAttribute("productList", productService.findByName(nameSearch));
        return "list";
    }
    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "detail";
    }
    @GetMapping("/delete/{index}")
    public String delete(@PathVariable int index, Model model){
        productService.deleteById(index);
        model.addAttribute("product", productService.findAll());
        return "redirect:/product/list";
    }
}
