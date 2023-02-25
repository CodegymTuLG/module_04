package com.example.bt1.service;

import com.example.bt1.model.User;
import com.example.bt1.respository.IUserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements IUserService {
    @Autowired
    IUserRespository respository;
    @Override
    public List<User> findAll() {
        return respository.findAll();
    }

    @Override
    public User findById(int id) {
        return respository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        respository.save(user);
    }

    @Override
    public void deleteById(int id) {
        respository.deleteById(id);
    }


}

