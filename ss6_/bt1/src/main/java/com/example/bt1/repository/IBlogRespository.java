package com.example.bt1.repository;

import com.example.bt1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRespository extends JpaRepository<Blog, Integer> {

}
