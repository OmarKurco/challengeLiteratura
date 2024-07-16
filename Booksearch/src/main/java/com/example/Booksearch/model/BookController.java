package com.example.Bookseach.controller;

import com.example.Booksearch.model.Book;
import com.example.Booksearch.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookController {
    @Autowired
    private BookService bookService;



    public List<Book> listAllBooks() {
        return bookService.listAllBooks();
    }
}
