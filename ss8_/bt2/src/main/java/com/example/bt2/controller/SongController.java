package com.example.bt2.controller;

import com.example.bt2.dto.SongDto;
import com.example.bt2.model.Song;
import com.example.bt2.service.ISongService;
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

import java.util.List;

@Controller
public class SongController {
    @Autowired
    ISongService service;

    @GetMapping("/song")
    public String showList(Model model){
        List<Song> songList = service.findAll();
        model.addAttribute("songList", songList);
        return "views/list";
    }
    @GetMapping("/song/create")
    public String showFormCreate(Model model){
        model.addAttribute("songDto", new SongDto());
        return "views/create";
    }
    @PostMapping("/song/create")
    public String save(@Validated  @ModelAttribute SongDto songDto, BindingResult bindingResult, Model model, RedirectAttributes attributes){
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "views/create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto, song);
        service.save(song);
        model.addAttribute("songList", service.findAll());
        return "redirect:/song";
    }
    @GetMapping("/song/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("songDto", service.findById(id));
        return "views/edit";
    }

    @PostMapping("/song/edit")
    public String edit(@Validated  @ModelAttribute SongDto songDto, BindingResult bindingResult){
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "views/create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto, song);
        service.save(song);
        return "redirect:/song";
    }
    @GetMapping("/song/detail/{id}")
    public String detail(@PathVariable int id, Model model){
        model.addAttribute("song", service.findById(id));
        return "views/detail";
    }
    @GetMapping("/song/delete/{id}")
    public String delete(@PathVariable int id){
        service.deleteById(id);
        return "redirect:/song";
    }
}
