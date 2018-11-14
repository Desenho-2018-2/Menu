package br.com.menu.menu.microservice.product.service;

import br.com.menu.menu.microservice.product.dto.ProductDto;
import br.com.menu.menu.microservice.product.mapper.ProductMapper;
import br.com.menu.menu.microservice.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public ProductDto createProduct(ProductDto productDto) {
        if (validateCategoryEntity(productDto)) {
            return productMapper.entityToDto(productRepository.save(productMapper.dtoToEntity(productDto)));
        }
        return null;
    }

    public ProductDto findProduct(Long id) {
        return productMapper.entityToDto(productRepository.findById(id).get());
    }

    public ProductDto updateProduct(ProductDto productDto) {
        if (validateCategoryEntity(productDto) && productDto.getProductId() != null) {
            return productMapper.entityToDto(productRepository.save(productMapper.dtoToEntity(productDto)));
        }
        return null;
    }

    public void deleteProduct(Long id ) {
        productRepository.deleteById(id);
    }

//    public Iterable<CategoryDto> listCategory() {
//        return categoryRepository.findAll().iterator().forEachRemaining(categoryEntity -> categoryMapper.entityToDto(categoryEntity));
//    }

    private boolean validateCategoryEntity(ProductDto productDto) {
        if(productDto.getName() != null && !productDto.getName().isEmpty()) {
            return true;
        }
        return false;
    }

}
