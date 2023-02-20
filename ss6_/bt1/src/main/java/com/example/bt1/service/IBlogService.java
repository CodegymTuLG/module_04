package com.example.bt1.service;

import com.example.bt1.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void deleteById(int id);
}
