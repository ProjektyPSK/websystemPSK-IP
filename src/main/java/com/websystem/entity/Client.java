package com.websystem.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"address","contact"})
@Table(schema = "websystem")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idClient;

    @NotEmpty
    private String login;

    @NotEmpty
    private String pass;

    private String company;

    private String lastName;

    private String name;

    private String typeOfCustomer;

    @ManyToOne
    private Address address;

    @ManyToOne
    private Contact contact;
}
