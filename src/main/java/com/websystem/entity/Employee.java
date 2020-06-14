package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "websystem")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmployee;

    private String login;

    private String pass;

    private String name;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Authorizations authorizations;

    private boolean activeAccount;

    private LocalDate dateOfEmployment;

    private LocalDate dismissEmployment;

    @OneToOne
    private Address address;

    @OneToOne
    private Contact contact;

    @ManyToMany
    private Set<Role> roles;


}
