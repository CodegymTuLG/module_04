package com.example.bt.service;

import com.example.bt.model.BookLibrary;
import com.example.bt.repository.IBookLibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookLibraryService implements IBookLibraryService{
    @Autowired
    IBookLibraryRepository iBookLibraryRepository;
    @Override
    public List<BookLibrary> findAll() {
        return iBookLibraryRepository.findAll();
    }

    @Override
    public BookLibrary findById(int id) {
        return iBookLibraryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(BookLibrary bookLibrary) {
        iBookLibraryRepository.save(bookLibrary);
    }

    @Override
    public void deleteById(int id) {

    }
}
