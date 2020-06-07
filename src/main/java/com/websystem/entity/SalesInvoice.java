package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "websystem")
public class SalesInvoice {

    @Id
    @GeneratedValue
    private long idSalesInvoice;

    private long idClient;

    private String numberSalesInvoice;

    private LocalDate dateSales;

    private String price;

    private String nameBank;

    private String paymentMethod;

}
