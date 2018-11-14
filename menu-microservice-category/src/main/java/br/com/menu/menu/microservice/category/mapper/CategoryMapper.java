package br.com.menu.menu.microservice.category.mapper;

import br.com.menu.menu.microservice.category.dto.CategoryDto;
import br.com.menu.menu.microservice.category.model.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

//    @Mappings({
//            @Mapping(source = "pk.name", target = "name"),
//            @Mapping(source = "pk.categoryId", target = "categoryId")
//    })
    CategoryDto entityToDto(CategoryEntity categoryEntity);

//    @Mappings({
//            @Mapping(source = "name", target = "pk.name"),
//            @Mapping(source = "categoryId", target = "pk.categoryId")
//    })
    CategoryEntity dtoToEntity(CategoryDto categoryDto);
}
