package com.example.bt1.service;

import com.example.bt1.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void deleteById(int id);
}
