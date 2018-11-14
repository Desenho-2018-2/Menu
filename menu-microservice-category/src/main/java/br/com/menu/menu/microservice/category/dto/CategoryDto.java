package br.com.menu.menu.microservice.category.dto;

import java.io.Serializable;

public class CategoryDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Long cetegoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCetegoryId() {
        return cetegoryId;
    }

    public void setCetegoryId(Long cetegoryId) {
        this.cetegoryId = cetegoryId;
    }
}
