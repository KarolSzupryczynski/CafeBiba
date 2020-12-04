package pl.coderslab.CafeBiba.controller;


        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;
        import pl.coderslab.CafeBiba.dao.BookDao;
        import pl.coderslab.CafeBiba.entity.Book;
        import pl.coderslab.CafeBiba.service.BookService;

@Controller
@RequestMapping("/bookview")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping
    public String form() {
        return "/form";
    }

    @PostMapping
    @ResponseBody
    public String form(Book book) {
        bookService.save(book);
        return book.toString();
    }
}
