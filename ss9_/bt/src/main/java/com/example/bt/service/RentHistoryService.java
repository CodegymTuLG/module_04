package com.example.bt.service;

import com.example.bt.model.RentHistory;
import com.example.bt.repository.IBookLibraryRepository;
import com.example.bt.repository.IRentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentHistoryService implements IRentHistoryService{
    @Autowired
    IRentHistoryRepository rentHistoryRepository;
    @Override
    public List<RentHistory> findAll() {
        return rentHistoryRepository.findAll();
    }

    @Override
    public RentHistory findById(int id) {
        return rentHistoryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(RentHistory rentHistory) {
        rentHistoryRepository.save(rentHistory);
    }

    @Override
    public void deleteById(int id) {

    }
}
