package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "websystem")
public class SalesInvoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSalesInvoice;

    private Long idClient;

    private String numberSalesInvoice;

    private LocalDate dateSales;

    private String price;

    private String nameBank;

    private String paymentMethod;

}
