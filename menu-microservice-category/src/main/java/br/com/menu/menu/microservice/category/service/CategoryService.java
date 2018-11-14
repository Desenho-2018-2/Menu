package br.com.menu.menu.microservice.category.service;

import br.com.menu.menu.microservice.category.dto.CategoryDto;
import br.com.menu.menu.microservice.category.model.CategoryEntity;
import br.com.menu.menu.microservice.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryEntity createCategory(CategoryEntity categoryEntity) {
        if(validateCategoryEntity(categoryEntity)) {
            return categoryRepository.save(categoryEntity);
        }
        return null;
    }

    private boolean validateCategoryEntity(CategoryEntity categoryEntity) {
        return true;
    }
}
