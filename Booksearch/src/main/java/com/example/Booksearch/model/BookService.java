package com.example.Booksearch.service;

import com.example.Booksearch.BooksearchApplication;
import com.example.Booksearch.model.Book;
import com.example.Booksearch.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book findBookByTitle(String title) {
        // Lógica para buscar libro en la API de Gutendex y registrarlo en la base de datos
        String url = "https://gutendex.com/books?search=" + title;
        // Aquí debes procesar la respuesta de la API y mapearla a la entidad Book
        // Guarda el libro en la base de datos
        return bookRepository.save(Book);
    }

    public List<Book> listAllBooks() {
        return bookRepository.findAll();
    }
}
