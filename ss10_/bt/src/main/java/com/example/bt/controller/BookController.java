package com.example.bt.controller;

import com.example.bt.dto.Cart;
import com.example.bt.model.Book;
import com.example.bt.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("cart")
public class BookController {
    @Autowired
    IBookService bookService;
    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }
    @GetMapping("/bookstore")
    public String showList(Model model){
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "list";
    }
    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable int id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Book book = bookService.findById(id);
        if (action.equals("+")) {
            cart.addBook(book);
            return "redirect:/shopping-cart";
        }
        if (action.equals("-")) {
            cart.degerBook(book);
            return "redirect:/shopping-cart";
        }
        cart.addBook(book);
        return "redirect:/bookstore";
    }
}
