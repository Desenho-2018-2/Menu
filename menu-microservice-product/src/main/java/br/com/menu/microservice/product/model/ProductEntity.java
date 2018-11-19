package br.com.menu.microservice.product.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCT")
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_TYPE_ID", nullable = false)
    private ProductTypeEntity productType;

    @Column(name = "DESCRIPTION", length = 100, nullable = true)
    private String description;

    @Column(name = "NAME", length = 20, nullable = false)
    private String name;

    @Column(name = "PRICE", precision = 2, nullable = false)
    private BigDecimal price;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductTypeEntity getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeEntity productType) {
        this.productType = productType;
    }
}
