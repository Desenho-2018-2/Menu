package br.com.menu.menu.microservice.category.model;

import java.io.Serializable;

public class CategoryEntityPk implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long categoryId;

    private String name;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
