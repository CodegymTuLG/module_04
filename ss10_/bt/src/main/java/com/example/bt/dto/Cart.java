package com.example.bt.dto;

import com.example.bt.model.Book;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Book,Integer> books = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Book,Integer> books) {
        this.books = books;
    }

    public Map<Book,Integer> getBooks() {
        return books;
    }

    private boolean checkItemInCart(Book book){
        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            if(entry.getKey().getId() == book.getId()){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Book, Integer> selectItemInCart(Book book){
        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            if(entry.getKey().getId() == book.getId()){
                return entry;
            }
        }
        return null;
    }

    public void addBook(Book book){
        if (!checkItemInCart(book)){
            books.put(book,1);
        } else {
            Map.Entry<Book, Integer> itemEntry = selectItemInCart(book);
            Integer newQuantity = itemEntry.getValue() + 1;
            books.replace(itemEntry.getKey(),newQuantity);
        }
    }
    public void degerBook(Book book){
            Map.Entry<Book, Integer> itemEntry = selectItemInCart(book);
            Integer newQuantity = itemEntry.getValue() - 1;
            if(newQuantity.equals(0)){
                books.remove(itemEntry.getKey());
            }else {
            books.replace(itemEntry.getKey(),newQuantity);
            }
    }

    public Integer countBookQuantity(){
        Integer bookQuantity = 0;
        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            bookQuantity += entry.getValue();
        }
        return bookQuantity;
    }

    public Integer countItemQuantity(){
        return books.size();
    }

    public Float countTotalPayment(){
        float payment = 0;
        for (Map.Entry<Book, Integer> entry : books.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }
}
