package com.example.bt2.respository;

import com.example.bt2.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRespository extends JpaRepository<Song, Integer> {

}
