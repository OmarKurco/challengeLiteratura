package com.example.Booksearch.repository;

import com.example.Booksearch.model.Author;
import org.springframework.data.repository.ListCrudRepository;

public interface AuthorRepository extends ListCrudRepository<Author, Long> {
    // No es necesario definir métodos como findAll() aquí, ya que se heredan de ListCrudRepository
}
