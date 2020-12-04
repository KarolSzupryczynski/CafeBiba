package pl.coderslab.CafeBiba.service;

import pl.coderslab.CafeBiba.entity.Author;

import java.util.List;

public interface AuthorService {
    void save(Author author);
    Author findById(Long id);
    List<Author> findAll();

}
