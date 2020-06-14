package com.websystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "websystem")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCategory;

    private String name;
}
