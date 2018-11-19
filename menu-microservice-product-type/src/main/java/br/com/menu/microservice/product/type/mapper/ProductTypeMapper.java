package br.com.menu.microservice.product.type.mapper;

import br.com.menu.microservice.product.type.dto.ProductTypeDto;
import br.com.menu.microservice.product.type.model.ProductTypeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductTypeMapper {

    ProductTypeEntity dtoToEntity(ProductTypeDto dto);

    ProductTypeDto entityToDto(ProductTypeEntity productTypeEntity);

}
