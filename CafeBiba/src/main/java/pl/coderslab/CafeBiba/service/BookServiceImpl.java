package pl.coderslab.CafeBiba.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.CafeBiba.entity.Book;
import pl.coderslab.CafeBiba.repository.BookRepository;
import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> viewAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book findBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
        logger.info("przekazano do usunięcia");
        bookRepository.delete(book);
    }
    @Override
    public void update(Book book) {
        book.setTitle(book.getTitle());
        book.setAuthor(book.getAuthor());
        book.setIsbn(book.getIsbn());
        book.setIssueDate(book.getIssueDate());
        book.setPublisher(book.getPublisher());
        book.setCategory(book.getCategory());
        bookRepository.save(book);
    }
}
