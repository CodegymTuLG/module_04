package com.example.bt.dto;

import com.example.bt.model.BookLibrary;

import javax.validation.constraints.Size;


public class RentHistoryDto{
    private int id;
    @Size(min = 5, max = 5, message = "Rent ID have 5 digits!")
    private String rentId;
    private BookLibrary bookId;
    private int statusId;

    public RentHistoryDto() {
    }

    public RentHistoryDto(int id, String rentId, BookLibrary bookId, int statusId) {
        this.id = id;
        this.rentId = rentId;
        this.bookId = bookId;
        this.statusId = statusId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    public BookLibrary getBookId() {
        return bookId;
    }

    public void setBookId(BookLibrary bookId) {
        this.bookId = bookId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

}
