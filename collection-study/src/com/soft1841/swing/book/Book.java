package com.soft1841.swing.book;

public class Book implements Comparable<Book> {
    private String name;
    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public  int compareTo(Book book){
        return this.getPrice()-book.getPrice();
    }
}
