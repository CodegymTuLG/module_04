package com.example.bt.service;

import com.example.bt.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    List<Blog> findByTypeId(int id);
    Blog findById(int id);
    void save(Blog blog);
    void deleteById(int id);
    List<Blog> findBytext(String text);
    Page<Blog> findAll(Pageable pageable);
}
