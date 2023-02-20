package com.example.ss6_.controller;

import com.example.ss6_.modal.Student;
import com.example.ss6_.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    IStudentService studentService;
    @GetMapping
    public String showList(){
        List<Student> studentList = studentService.findAll();
        return "list";
    }
}
