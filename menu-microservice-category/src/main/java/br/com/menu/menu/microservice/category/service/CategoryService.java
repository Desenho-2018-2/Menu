package br.com.menu.menu.microservice.category.service;

import br.com.menu.menu.microservice.category.dto.CategoryDto;
import br.com.menu.menu.microservice.category.mapper.CategoryMapper;
import br.com.menu.menu.microservice.category.model.CategoryEntity;
import br.com.menu.menu.microservice.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryDto createCategory(CategoryDto categoryDto) {
        if (validateCategoryEntity(categoryDto)) {
            return categoryMapper.entityToDto(categoryRepository.save(categoryMapper.dtoToEntity(categoryDto)));
        }
        return null;
    }

    public CategoryDto foundCategory(Long id) {
        return categoryMapper.entityToDto(categoryRepository.findById(id).get());
    }

    public CategoryDto updateCategory(CategoryDto categoryDto) {
        if (validateCategoryEntity(categoryDto) && categoryDto.getCategoryId() != null) {
            return categoryMapper.entityToDto(categoryRepository.save(categoryMapper.dtoToEntity(categoryDto)));
        }
        return null;
    }

    public void deleteCategory(Long id ) {
        categoryRepository.deleteById(id);
    }

    public List<CategoryDto> listCategory() {
        List<CategoryEntity> categoryEntities = (List<CategoryEntity>) categoryRepository.findAll();
        return categoryEntities.stream().map(a -> categoryMapper.entityToDto(a)).collect(Collectors.toList());
    }

    private boolean validateCategoryEntity(CategoryDto categoryDto) {
        if(categoryDto.getName() != null && !categoryDto.getName().isEmpty()) {
            return true;
        }
        return false;
    }
}
