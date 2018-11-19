package br.com.menu.microservice.product.mapper;

import br.com.menu.microservice.product.dto.ProductRequestDto;
import br.com.menu.microservice.product.dto.ProductResponseDto;
import br.com.menu.microservice.product.model.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductRequestDto entityToDto(ProductEntity productEntity);

    ProductEntity dtoToEntity(ProductRequestDto productDto);

    @Mappings({
            @Mapping(source = "productType.description", target = "productType"),
            @Mapping(source = "productType.category", target = "category")
    })
    ProductResponseDto entityToResponseDto(ProductEntity productEntity);
}
