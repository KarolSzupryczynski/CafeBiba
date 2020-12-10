package pl.coderslab.CafeBiba.service;
import pl.coderslab.CafeBiba.entity.Book;

import java.util.List;


public interface BookService  {

    List<Book> viewAllBooks();
    Book findBookById(Long id);
    void addBook(Book book);
    void deleteBookById(Long id);
    void update(Book book);
}