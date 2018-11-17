package br.com.menu.microservice.product.mapper;

import br.com.menu.microservice.product.dto.ProductTypeDto;
import br.com.menu.microservice.product.model.ProductTypeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper {

    ProductTypeEntity dtoToEntity(ProductTypeDto dto);

    ProductTypeDto entityToDto(ProductTypeEntity productTypeEntity);

}
