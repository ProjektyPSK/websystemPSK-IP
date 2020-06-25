package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "websystem")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrder;

    @ManyToOne
    private Client client;

    @OneToOne
    private User user;

    private LocalDate dateOfOrder;

    private boolean acceptanceOrder;

    private LocalDate dateOfAcceptanceOrder;

    private String payment;

    private LocalDate dateOfShipment;

    private boolean orderReleased;

    private LocalDate dateOfReleasedOrder;


}
