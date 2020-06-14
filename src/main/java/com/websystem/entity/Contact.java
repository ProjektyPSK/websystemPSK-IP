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
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idContact;

    private String phoneNumber;

    private String faxNumber;

    private String email;

    private String mySite;


}
