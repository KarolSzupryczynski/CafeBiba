package pl.coderslab.CafeBiba.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.CafeBiba.entity.Book;
import pl.coderslab.CafeBiba.service.BookServiceImpl;

@Controller
public class BookController {

    private final BookServiceImpl bookServiceImpl;
    Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    public BookController(BookServiceImpl bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }

    @GetMapping("/books")
    public String viewAllBooks(Model model) {
        model.addAttribute("books", bookServiceImpl.viewAllBooks());
        return "/viewbook";
    }

    @GetMapping("/viewbook/{id}")
    public String findBookById(Model model, @PathVariable Long id) {
        model.addAttribute("books", bookServiceImpl.findBookById(id));
        logger.info("pobrano id " + id);
        return "/viewsinglebook";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "/form";

    }
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String saveBook(Book book) {
        bookServiceImpl.addBook(book);
        return "/addsuccess";
    }

    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
    public String editBookById(Model model, @PathVariable Long id) {
        model.addAttribute("book", bookServiceImpl.findBookById(id));
        logger.info("pobrano id " + id);
        return "editform";
    }

    @RequestMapping(value = "/editform", method = RequestMethod.POST)
    public String editBook(Book book) {
        bookServiceImpl.update(book);
        return "redirect:/books";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBookById(@PathVariable long id) {
        logger.info("pobrano id " + id);
        bookServiceImpl.deleteBookById(id);
        return "redirect:/books";
    }
}
