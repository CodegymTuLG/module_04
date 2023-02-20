package com.example.bt1.respository;

import com.example.bt1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRespository extends JpaRepository<Blog, Integer> {

}
