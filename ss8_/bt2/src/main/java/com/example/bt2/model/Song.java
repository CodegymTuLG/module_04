package com.example.bt2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String songName;
    private String singer;
    private String type;


    public Song() {
    }

    public Song(int id, String songName, String singer, String type) {
        this.id = id;
        this.songName = songName;
        this.singer = singer;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String firstName) {
        this.songName = firstName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String lastName) {
        this.singer = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String age) {
        this.type = age;
    }
}
