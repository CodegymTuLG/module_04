package com.example.bt2.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto implements Validator {
    private int id;
    @NotEmpty(message = "songName is not empty!")
    @Size(max = 800,message = "Do not exceed 800 characters")
    @Pattern(regexp = "[a-zA-Z0-9]*$",message = "Does not contain special characters like @ ; , . = - + , ….")
    private String songName;
    @NotEmpty(message = "Singer name is not empty!")
    @Size(max = 300,message = "Do not exceed 300 characters")
    @Pattern(regexp = "[a-zA-Z0-9]*$",message = "Does not contain special characters like @ ; , . = - + , ….")
    private String singer;
    @NotEmpty(message = "Singer name is not empty!")
    @Size(max = 1000,message = "Do not exceed 1000 characters")
    @Pattern(regexp = "[a-zA-Z0-9,]*$",message = "Except the comma \",\".Does not contain special characters like @ ; . = - + , ….")
    private String type;

    public SongDto() {
    }

    public SongDto(int id, String songName, String singer, String age) {
        this.id = id;
        this.songName = songName;
        this.singer = singer;
        this.type = age;
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

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
    }
}
