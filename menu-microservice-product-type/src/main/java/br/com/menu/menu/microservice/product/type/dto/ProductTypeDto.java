package br.com.menu.menu.microservice.product.type.dto;

import br.com.menu.menu.microservice.product.type.enums.Category;

import java.io.Serializable;

public class ProductTypeDto implements Serializable {

    private static final long serialVersionUID = 2L;

    private Long productTypeId;

    private String description;

    private Category category;

    public Long getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
