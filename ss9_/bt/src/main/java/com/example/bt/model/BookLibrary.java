package com.example.bt.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookLibrary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookName;
    private int count;
    @OneToMany(mappedBy = "bookId")
    private Set<RentHistory> setBookId;

    public BookLibrary() {
    }

    public BookLibrary(int id, String bookName, int count) {
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
