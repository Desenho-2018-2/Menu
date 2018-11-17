package br.com.menu.menu.microservice.product.type.model;

import java.io.Serializable;

public class ProductTypeEntityPk implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productTypeId;

    private String description;

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
}
