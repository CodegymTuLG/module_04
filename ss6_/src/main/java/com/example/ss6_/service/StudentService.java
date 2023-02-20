package com.example.ss6_.service;

import com.example.ss6_.modal.Student;
import com.example.ss6_.respository.IStudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService{
    @Autowired
    IStudentRespository studentRespository;
    @Override
    public List<Student> findAll() {
        return studentRespository.findAll();
    }
}
