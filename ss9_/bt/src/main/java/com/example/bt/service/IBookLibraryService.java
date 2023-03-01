package com.example.bt.service;

import com.example.bt.model.BookLibrary;

import java.util.List;

public interface IBookLibraryService {
    List<BookLibrary> findAll();
    BookLibrary findById(int id);
    void save(BookLibrary bookLibrary);
    void deleteById(int id);
}
