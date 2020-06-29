package com.websystem.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(schema = "websystem")
public class Orders {
    public Orders(Long idOrder, User client, User user, LocalDate dateOfOrder, boolean acceptanceOrder, LocalDate dateOfAcceptanceOrder, String payment, LocalDate dateOfShipment, boolean orderReleased, LocalDate dateOfReleasedOrder) {
        this.idOrder = idOrder;
        this.client = client;
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.acceptanceOrder = acceptanceOrder;
        this.dateOfAcceptanceOrder = dateOfAcceptanceOrder;
        this.payment = payment;
        this.dateOfShipment = dateOfShipment;
        this.orderReleased = orderReleased;
        this.dateOfReleasedOrder = dateOfReleasedOrder;
    }

    public Orders() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOrder;

    @ManyToOne
    private User client;

    @OneToOne
    private User user;

    private LocalDate dateOfOrder;

    private boolean acceptanceOrder;

    private LocalDate dateOfAcceptanceOrder;

    private String payment;

    private LocalDate dateOfShipment;

    private boolean orderReleased;

    private LocalDate dateOfReleasedOrder;

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public boolean isAcceptanceOrder() {
        return acceptanceOrder;
    }

    public void setAcceptanceOrder(boolean acceptanceOrder) {
        this.acceptanceOrder = acceptanceOrder;
    }

    public LocalDate getDateOfAcceptanceOrder() {
        return dateOfAcceptanceOrder;
    }

    public void setDateOfAcceptanceOrder(LocalDate dateOfAcceptanceOrder) {
        this.dateOfAcceptanceOrder = dateOfAcceptanceOrder;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public LocalDate getDateOfShipment() {
        return dateOfShipment;
    }

    public void setDateOfShipment(LocalDate dateOfShipment) {
        this.dateOfShipment = dateOfShipment;
    }

    public boolean isOrderReleased() {
        return orderReleased;
    }

    public void setOrderReleased(boolean orderReleased) {
        this.orderReleased = orderReleased;
    }

    public LocalDate getDateOfReleasedOrder() {
        return dateOfReleasedOrder;
    }

    public void setDateOfReleasedOrder(LocalDate dateOfReleasedOrder) {
        this.dateOfReleasedOrder = dateOfReleasedOrder;
    }
}
