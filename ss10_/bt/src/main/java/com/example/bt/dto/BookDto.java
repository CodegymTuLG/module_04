package com.example.bt.dto;

public class BookDto {
    private int id;
    private String imageURL;
    private String name;
    private long price;

    public BookDto() {
    }

    public BookDto(int id, String imageURL, String name, long price) {
        this.id = id;
        this.imageURL = imageURL;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
