package pl.coderslab.CafeBiba.service;

import pl.coderslab.CafeBiba.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> viewAllAuthors();
    Author findAuthorById(Long id);
}

