package br.com.menu.microservice.product.service;

import br.com.menu.microservice.product.dto.ProductRequestDto;
import br.com.menu.microservice.product.dto.ProductResponseDto;
import br.com.menu.microservice.product.dto.ProductTypeDto;
import br.com.menu.microservice.product.mapper.ProductMapper;
import br.com.menu.microservice.product.mapper.ProductTypeMapper;
import br.com.menu.microservice.product.model.ProductEntity;
import br.com.menu.microservice.product.repository.ProductRepository;
import br.com.menu.microservice.product.service.rest.ProductServiceRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Autowired
    private ProductServiceRest productServiceRest;

    public ProductResponseDto createProduct(final ProductRequestDto productDto) {
        ProductTypeDto productTypeDto = productServiceRest.getProductType(productDto.getProductTypeId());
        ProductEntity productEntity = productMapper.dtoToEntity(productDto);
        productEntity.setProductType(productTypeMapper.dtoToEntity(productTypeDto));
        productRepository.save(productEntity);
        return productMapper.entityToResponseDto(productEntity);
    }

    public ProductRequestDto findProduct(Long id) {
        return productMapper.entityToDto(productRepository.findById(id).get());
    }

    public ProductRequestDto updateProduct(ProductRequestDto productDto) {
        return productMapper.entityToDto(productRepository.save(productMapper.dtoToEntity(productDto)));
    }

    public void deleteProduct(Long id ) {
        productRepository.deleteById(id);
    }



//    public Iterable<CategoryDto> listCategory() {
//        return categoryRepository.findAll().iterator().forEachRemaining(categoryEntity -> categoryMapper.entityToDto(categoryEntity));
//    }

}
