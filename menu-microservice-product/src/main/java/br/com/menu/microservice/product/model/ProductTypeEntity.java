package br.com.menu.microservice.product.model;

import br.com.menu.microservice.product.enums.Category;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_TYPE")
public class ProductTypeEntity implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @Column(name = "PRODUCT_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productTypeId;

    @Column(name = "DESCRIPTION", length = 50, nullable = false, unique = true)
    private String description;

    @Column(name = "CATEGORY", nullable = false)
    @Enumerated(EnumType.STRING)
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