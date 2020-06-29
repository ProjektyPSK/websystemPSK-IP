package com.websystem.entity;

import javax.persistence.*;

@Entity
@Table(schema = "websystem")
public class Address {
    public Address(Long idAddress, String city, String province, String county, String postCode, String street, String houseNumber, String apartmentNumber) {
        this.idAddress = idAddress;
        this.city = city;
        this.province = province;
        this.county = county;
        this.postCode = postCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public Address() {
    }

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

    public Long getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
