package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "websystem")
public class Address {

    @Id
    @GeneratedValue
    private long idAddress;

    private String city;

    private String province;

    private String county;

    private String postCode;

    private String street;

    private String houseNumber;

    private String apartmentNumber;

}
