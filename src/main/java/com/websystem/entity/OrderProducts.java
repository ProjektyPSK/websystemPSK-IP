package com.websystem.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "websystem")
public class OrderProducts {

    @Id
    @GeneratedValue
    private long idOrderProducts;

    @ManyToOne
    private Orders orders;

    @ManyToOne
    private Products products;
}
