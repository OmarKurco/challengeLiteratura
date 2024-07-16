package com.example.Booksearch.model.;

import java.util.Date;
import java.util.List;

public class Author {
    private Long id;

    private String name;

    private Date birthDate;

    private Date deathDate;

    private List<Libro> books;

    // Constructor vacío
    public Author() {
    }

    // Constructor con parámetros
    public Author(String name, Date birthDate, Date deathDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public List<Libro> getBooks() {
        return books;
    }

    public void setBooks(List<Libro> books) {
        this.books = books;
    }
}
