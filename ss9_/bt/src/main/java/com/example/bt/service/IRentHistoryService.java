package com.example.bt.service;

import com.example.bt.model.RentHistory;

import java.util.List;

public interface IRentHistoryService {
    List<RentHistory> findAll();
    RentHistory findById(int id);
    void save(RentHistory rentHistory);
    void deleteById(int id);
}
