package com.example.bt.dto;

import com.example.bt.model.RentHistory;

import java.util.Set;

public class BookLibraryDto {
    private int id;
    private String bookName;
    private int count;
    private Set<RentHistory> setBookId;

    public BookLibraryDto() {
    }

    public BookLibraryDto(int id, String bookName, int count) {
        this.id = id;
        this.bookName = bookName;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
