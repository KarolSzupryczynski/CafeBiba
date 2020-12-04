package pl.coderslab.CafeBiba.service;
import pl.coderslab.CafeBiba.entity.Book;

import java.util.List;

public interface BookService  {

    void save(Book book);
    Book findById(Long id);
    boolean deleteById(Long id);
    List<Book> findAll();

}