package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "websystem")
@AllArgsConstructor
@NoArgsConstructor
public class OrderProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrderProducts;

    @ManyToOne
    private Orders orders;

    @ManyToOne
    private Products products;
}
