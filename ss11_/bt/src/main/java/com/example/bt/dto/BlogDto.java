package com.example.bt.dto;

import com.example.bt.model.Type;

public class BlogDto {
    private int id;
    private String title;
    private String body;
    private Type type;

    public BlogDto() {
    }

    public BlogDto(int id, String title, String body, Type type) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
