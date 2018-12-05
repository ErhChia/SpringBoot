package com.example.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @Column(name = "id_")
    String id;
    @Column(name = "no_")
    String no;
    @ManyToOne
    @JoinColumn(name = "clazz_id_")
    private Clazz clazz;

    @ManyToMany(mappedBy = "students")
    List<Clazz> clazzes;

}

