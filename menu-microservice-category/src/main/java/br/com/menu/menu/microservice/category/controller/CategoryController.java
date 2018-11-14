package br.com.menu.menu.microservice.category.controller;
import br.com.menu.menu.microservice.category.model.CategoryEntity;
import br.com.menu.menu.microservice.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu/category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @PostMapping("/create")
    public CategoryEntity createCategory(CategoryEntity categoryEntity){
        return categoryService.createCategory(categoryEntity);
    }

    @GetMapping("/foundCategory")

}
