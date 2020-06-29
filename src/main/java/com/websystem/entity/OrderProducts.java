package com.websystem.entity;

import javax.persistence.*;

@Entity
@Table(schema = "websystem")
public class OrderProducts {

    public OrderProducts(Long idOrderProducts, Orders orders, Products products) {
        this.idOrderProducts = idOrderProducts;
        this.orders = orders;
        this.products = products;
    }

    public OrderProducts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrderProducts;

    @ManyToOne
    private Orders orders;

    @ManyToOne
    private Products products;

    public Long getIdOrderProducts() {
        return idOrderProducts;
    }

    public void setIdOrderProducts(Long idOrderProducts) {
        this.idOrderProducts = idOrderProducts;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
