package br.com.menu.menu.microservice.category.controller;

import br.com.menu.menu.microservice.category.dto.CategoryDto;
import br.com.menu.menu.microservice.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu/category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @PostMapping("/create")
    public CategoryDto createCategory(@RequestBody final CategoryDto categoryDto){
        return categoryService.createCategory(categoryDto);
    }

    @GetMapping("/find/{id}")
    public CategoryDto foundCategory(@PathVariable final Long id){
        return categoryService.findCategory(id);
    }

    @PutMapping("/update")
    public CategoryDto updateCategory(@RequestBody CategoryDto categoryDto) {
        return categoryService.updateCategory(categoryDto);
    }

    @DeleteMapping("/delete")
    public void deleteCategory(@RequestBody CategoryDto categoryDto) {
        categoryService.deleteCategory(categoryDto);
    }

    @GetMapping("/list")
    public List<CategoryDto> listCategory() {
       return categoryService.listCategory();
    }
}
