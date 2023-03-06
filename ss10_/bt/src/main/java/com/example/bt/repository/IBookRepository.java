package com.example.bt.repository;

import com.example.bt.model.BookLibrary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookLibraryRepository extends JpaRepository<BookLibrary, Integer> {
}
