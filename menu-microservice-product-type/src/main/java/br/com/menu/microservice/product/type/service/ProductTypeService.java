package br.com.menu.microservice.product.type.service;

import br.com.menu.microservice.product.type.dto.ProductTypeDto;
import br.com.menu.microservice.product.type.mapper.ProductTypeMapper;
import br.com.menu.microservice.product.type.model.ProductTypeEntity;
import br.com.menu.microservice.product.type.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductTypeService {

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private ProductTypeMapper productTypeMapper;

    public ProductTypeDto createProductType(ProductTypeDto productTypeDto) {
        return productTypeMapper.entityToDto(productTypeRepository.save(productTypeMapper.dtoToEntity(productTypeDto)));
    }

    public ProductTypeDto findProductType(final Long id) {
        return productTypeMapper.entityToDto(productTypeRepository.findById(id).get());
    }

    public void deleteProductType(final Long id) {
        productTypeRepository.deleteById(id);
    }

    public List<ProductTypeDto> listProductType() {
        List<ProductTypeEntity> productTypeEntities = (List<ProductTypeEntity>) productTypeRepository.findAll();
        return productTypeEntities.stream().map(a -> productTypeMapper.entityToDto(a)).collect(Collectors.toList());
    }

}
