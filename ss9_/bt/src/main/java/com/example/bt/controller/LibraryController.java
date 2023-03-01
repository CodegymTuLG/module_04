package com.example.bt.controller;

import com.example.bt.dto.BookLibraryDto;
import com.example.bt.dto.RentHistoryDto;
import com.example.bt.model.BookLibrary;
import com.example.bt.model.RentHistory;
import com.example.bt.service.IBookLibraryService;
import com.example.bt.service.IRentHistoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class LibraryController {
    @Autowired
    IBookLibraryService bookLibraryService;
    @Autowired
    IRentHistoryService rentHistoryService;

    @GetMapping("/library")
    public String showList(Model model){
        List<BookLibrary> libraryList = bookLibraryService.findAll();
        model.addAttribute("libraryList", libraryList);
        return "list";
    }
    @GetMapping("/library/create")
    public String showFormCreate(Model model){
        model.addAttribute("bookLibraryDto", new BookLibraryDto());
        return "create";
    }
    @GetMapping("/library/rent")
    public String showFormRent(Model model){
        model.addAttribute("rentHistoryDto", new RentHistoryDto());
        model.addAttribute("bookLibrary",bookLibraryService.findAll());
        return "rent";
    }
    @GetMapping("/library/return")
    public String showFormReturn(Model model){
        model.addAttribute("rentHistoryDto", new RentHistoryDto());
        model.addAttribute("bookLibrary",bookLibraryService.findAll());
        return "return";
    }
    @PostMapping("/library/create")
    public String save(@ModelAttribute BookLibraryDto libraryDto, Model model){
        BookLibrary library = new BookLibrary();
        BeanUtils.copyProperties(libraryDto, library);
        bookLibraryService.save(library);
        model.addAttribute("libraryList", bookLibraryService.findAll());
        return "redirect:/library";
    }
    @PostMapping("/library/rent")
    public String rent(@Validated @ModelAttribute RentHistoryDto rentHistoryDto, BindingResult bindingResult, Model model){
        String messageError = "Dont have any book to rent, Please try again!";
        if (bindingResult.hasFieldErrors()){
// thiếu bookLibrary nên nếu bị bắt validate thì sẽ bị lỗi
            return "rent";
        }
        RentHistory rentHistory = new RentHistory();
        BeanUtils.copyProperties(rentHistoryDto, rentHistory);
        BookLibrary bookLibrary = bookLibraryService.findById(rentHistoryDto.getBookId().getId());
        if(bookLibrary.getCount()==0){
            model.addAttribute("message",messageError);
            model.addAttribute("rentHistoryDto", new RentHistoryDto());
            model.addAttribute("bookLibrary",bookLibraryService.findAll());
            return "rent";
        }
        bookLibrary.setCount(bookLibrary.getCount()-1);
        bookLibraryService.save(bookLibrary);
        rentHistoryService.save(rentHistory);
        model.addAttribute("libraryList", bookLibraryService.findAll());
        return "redirect:/library";
    }
    @PostMapping("/library/return")
    public String returnBook(@Validated @ModelAttribute RentHistoryDto rentHistoryDto, BindingResult bindingResult, Model model){
        if (bindingResult.hasFieldErrors()){
// thiếu bookLibrary nên nếu bị bắt validate thì sẽ bị lỗi
            return "return";
        }
        List<RentHistory> rentHistoryList = rentHistoryService.findAll();
        boolean findOut = false;
        RentHistory rentHistory = new RentHistory();
        String messageRentIdNotTrue = "Rent Id not true, please try again!";
        String messageReturned = "Rent Id is true, but returned, please try again!";
        for (RentHistory r: rentHistoryList) {
            if(rentHistoryDto.getRentId().equals(r.getRentId())){
                rentHistory = rentHistoryService.findById(r.getId());
                if(rentHistory.getStatusId()==0){
                    model.addAttribute("message",messageReturned);
                    return "return";
                }
                rentHistory.setStatusId(0);
                rentHistoryService.save(rentHistory);
                findOut = true;
            }
        }
        if (!findOut){
            model.addAttribute("message",messageRentIdNotTrue);
            return "return";
        }
        BookLibrary bookLibrary = bookLibraryService.findById(rentHistory.getBookId().getId());
        bookLibrary.setCount(bookLibrary.getCount()+1);
        bookLibraryService.save(bookLibrary);
        model.addAttribute("libraryList", bookLibraryService.findAll());
        return "redirect:/library";
    }
}
