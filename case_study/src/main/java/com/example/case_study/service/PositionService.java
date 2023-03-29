package com.example.case_study.service;

import com.example.case_study.model.Position_;

import java.util.List;

public interface PositionService extends IPositionService{
    List<Position_> findAll();
}
