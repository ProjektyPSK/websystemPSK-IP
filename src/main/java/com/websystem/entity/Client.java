package com.websystem.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"address","contact"})
@Table(schema = "websystem")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idClient;

    private String login;

    private String pass;

    private String company;

    private String lastName;

    private String name;

    private String typeOfCustomer;

    @OneToOne
    private Address address;

    @OneToOne
    private Contact contact;
}
