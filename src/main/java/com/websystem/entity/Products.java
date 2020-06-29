package com.websystem.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(schema = "websystem")
public class Products {

    public Products(Long idProduct, String nameProduct, String type, String version, String description, BigDecimal price, String productCode) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.type = type;
        this.version = version;
        this.description = description;
        this.price = price;
        this.productCode = productCode;
    }

    public Products() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;

    private String nameProduct;

    private String type;

    private String version;

    private String description;

    private BigDecimal price;

    private String productCode;



    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }







}
