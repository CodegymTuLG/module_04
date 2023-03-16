package com.example.bt1.service;

import com.example.bt1.model.Type;
import com.example.bt1.repository.ITypeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeService implements ITypeService{
@Autowired
    ITypeRespository respository;
    @Override
    public List<Type> findAll() {
        return respository.findAll();
    }
}
