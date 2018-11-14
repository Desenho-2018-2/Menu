package br.com.menu.menu.microservice.category.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CATEGORY")
public class CategoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "NAME", length = 20, nullable = false)
    private String name;

    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
