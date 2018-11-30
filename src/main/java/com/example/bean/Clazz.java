package com.example.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Clazz {
    @Column(name = "grade_")
    private int grade;
    @Id
    @Column(name = "id_")
    private String id;
}
