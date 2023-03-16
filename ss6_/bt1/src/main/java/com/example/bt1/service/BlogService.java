package com.example.bt1.service;

import com.example.bt1.model.Blog;
import com.example.bt1.repository.IBlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService{
    @Autowired
    IBlogRespository respository;
    @Override
    public List<Blog> findAll() {
        return respository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return respository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        respository.save(blog);
    }

    @Override
    public void deleteById(int id) {
        respository.deleteById(id);
    }


}

