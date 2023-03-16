package com.example.bt.repository;

import com.example.bt.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBlogRespository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog where type_id = ?", nativeQuery = true)
    List<Blog> findByTypeId(int id);
    @Query(value = "select * from blog where body like ?", nativeQuery = true)
    List<Blog> findBytext(String text);
    Page<Blog> findAll(Pageable pageable);
}
