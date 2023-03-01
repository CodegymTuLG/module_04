package com.example.bt.model;

import javax.persistence.*;

@Entity
public class RentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rentId;
    @ManyToOne
    @JoinColumn(name = "bookId",referencedColumnName = "id")
    private BookLibrary bookId;
    private int statusId;

    public RentHistory() {
    }

    public RentHistory(int id, String rentId, BookLibrary bookId, int statusId) {
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
