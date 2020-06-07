package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "websystem")
public class Products {

    @Id
    @GeneratedValue()
    private long idProduct;

    private String nameProduct;

    private String type;

    private String version;

    private String description;

    private BigDecimal price;

    private String productCode;

    private LocalDate dateOfPurchase;

    private LocalDate saleDate;

    private boolean isSale;


}
