package br.com.menu.menu.microservice.product.type.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_TYPE")
@IdClass(ProductTypeEntityPk.class)
public class ProductTypeEntity implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @Column(name = "PRODUCT_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productTypeId;

    @Id
    @Column(name = "DESCRIPTION", length = 50, nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private CategoryEntity categoryEntity;

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

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }
}
