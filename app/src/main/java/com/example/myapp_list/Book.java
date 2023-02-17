package com.example.myapp_list;

public class Book {
    private String book_name;
    private String book_author;
    private String book_year;

    public Book (String book_author, String book_name, String book_year){
        this.book_author = book_author;
        this.book_name = book_name;
        this.book_year = book_year;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public String getBook_year() {
        return book_year;
    }

    public void setBook_year(String book_year) {
        this.book_year = book_year;
    }
}
