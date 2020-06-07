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
public class Contact {

    @Id
    @GeneratedValue
    private long idContact;

    private String phoneNumber;

    private String faxNumber;

    private String email;

    private String mySite;


}
