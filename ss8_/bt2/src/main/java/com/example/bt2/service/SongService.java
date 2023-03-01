package com.example.bt2.service;

import com.example.bt2.model.Song;
import com.example.bt2.respository.ISongRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    ISongRespository respository;
    @Override
    public List<Song> findAll() {
        return respository.findAll();
    }

    @Override
    public Song findById(int id) {
        return respository.findById(id).orElse(null);
    }

    @Override
    public void save(Song song) {
        respository.save(song);
    }

    @Override
    public void deleteById(int id) {
        respository.deleteById(id);
    }


}

