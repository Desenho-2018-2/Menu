package br.com.menu.menu.microservice.product.mapper;

import br.com.menu.menu.microservice.product.dto.ProductDto;
import br.com.menu.menu.microservice.product.model.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto entityToDto(ProductEntity productEntity);

    ProductEntity dtoToEntity(ProductDto productDto);
}
