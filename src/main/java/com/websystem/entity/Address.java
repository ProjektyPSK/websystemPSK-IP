package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "websystem")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAddress;

    private String city;

    private String province;

    private String county;

    private String postCode;

    private String street;

    private String houseNumber;

    private String apartmentNumber;

}
