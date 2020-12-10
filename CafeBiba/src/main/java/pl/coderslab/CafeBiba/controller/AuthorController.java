package pl.coderslab.CafeBiba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.CafeBiba.entity.Author;
import pl.coderslab.CafeBiba.service.AuthorServiceImpl;

import java.util.Collection;


@Controller
public class AuthorController {

    private final AuthorServiceImpl authorServiceImpl;

    @Autowired
    public AuthorController(AuthorServiceImpl authorServiceImpl) {
        this.authorServiceImpl = authorServiceImpl;
    }

    @GetMapping("/authors")
    public String viewAllAuthors(Model model) {
        model.addAttribute("authors", authorServiceImpl.viewAllAuthors());
        return "/viewauthors";
    }

    @GetMapping("/viewauthor/{id}")
    public String findAuthorById(Model model, @PathVariable Long id) {
        model.addAttribute("authors", authorServiceImpl.findAuthorById(id));
        return "/viewsingleauthor";
    }
    @ModelAttribute("authorsList")
    public Collection<Author> authors() {
        return this.authorServiceImpl.viewAllAuthors();
    }



}