package pl.coderslab.CafeBiba.service;

import pl.coderslab.CafeBiba.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> viewAllCategories();
    Category findCategoryById(Long id);
//    String categoryShortcutMaker (String name);
}

