package com.example.bt2.service;

import com.example.bt2.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    Song findById(int id);
    void save(Song song);
    void deleteById(int id);
}
