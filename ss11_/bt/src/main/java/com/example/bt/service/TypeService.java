package com.example.bt.service;

import com.example.bt.model.Type;
import com.example.bt.repository.ITypeRespository;
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
