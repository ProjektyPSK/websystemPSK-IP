package com.websystem.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "websystem")
public class SalesInvoice {

    public SalesInvoice(Long idSalesInvoice, Long idClient, String numberSalesInvoice, LocalDate dateSales, String price, String nameBank, String paymentMethod) {
        this.idSalesInvoice = idSalesInvoice;
        this.idClient = idClient;
        this.numberSalesInvoice = numberSalesInvoice;
        this.dateSales = dateSales;
        this.price = price;
        this.nameBank = nameBank;
        this.paymentMethod = paymentMethod;
    }

    public SalesInvoice() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSalesInvoice;

    private Long idClient;

    private String numberSalesInvoice;

    private LocalDate dateSales;

    private String price;

    private String nameBank;

    private String paymentMethod;

    public Long getIdSalesInvoice() {
        return idSalesInvoice;
    }

    public void setIdSalesInvoice(Long idSalesInvoice) {
        this.idSalesInvoice = idSalesInvoice;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNumberSalesInvoice() {
        return numberSalesInvoice;
    }

    public void setNumberSalesInvoice(String numberSalesInvoice) {
        this.numberSalesInvoice = numberSalesInvoice;
    }

    public LocalDate getDateSales() {
        return dateSales;
    }

    public void setDateSales(LocalDate dateSales) {
        this.dateSales = dateSales;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
