package com.example.bt.service;

import com.example.bt.model.Blog;
import com.example.bt.repository.IBlogRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public List<Blog> findByTypeId(int id) {
        return respository.findByTypeId(id);
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

    @Override
    public List<Blog> findBytext(String text) {
        return respository.findBytext(text);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return respository.findAll(pageable);
    }


}

