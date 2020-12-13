package pl.coderslab.CafeBiba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.CafeBiba.entity.Category;
import pl.coderslab.CafeBiba.service.CategoryServiceImpl;

import java.util.Collection;


@Controller
public class CategoryController {

    private final CategoryServiceImpl categoryServiceImpl;

    @Autowired
    public CategoryController(CategoryServiceImpl categoryServiceImpl) {
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping("/categories")
    public String viewAllCategories(Model model) {
        model.addAttribute("categories", categoryServiceImpl.viewAllCategories());
        return "/viewcategories";
    }

    @GetMapping("/viewcategory/{id}")
    public String findCategoryById(Model model, @PathVariable Long id) {
        model.addAttribute("categories", categoryServiceImpl.findCategoryById(id));
        return "/viewsinglecategory";
    }

    @ModelAttribute("categories")
    public Collection<Category> categories() {
        return this.categoryServiceImpl.viewAllCategories();
    }
}