package com.websystem.entity;

import javax.persistence.*;


@Entity
@Table(schema = "websystem")
public class Contact {
    public Contact(Long idContact, String phoneNumber, String faxNumber, String email, String mySite) {
        this.idContact = idContact;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.email = email;
        this.mySite = mySite;
    }

    public Contact() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContact;

    private String phoneNumber;

    private String faxNumber;

    private String email;

    private String mySite;

    public Long getIdContact() {
        return idContact;
    }

    public void setIdContact(Long idContact) {
        this.idContact = idContact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMySite() {
        return mySite;
    }

    public void setMySite(String mySite) {
        this.mySite = mySite;
    }
}
