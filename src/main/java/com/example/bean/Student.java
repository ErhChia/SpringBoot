package com.example.bean;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @Column(name = "id_")
    String id;
    @Column(name = "no_")
    String no;
    @ManyToOne
    @JoinColumn(name = "grade_id_")
    private Clazz clazz;
}

