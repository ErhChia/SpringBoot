package com.example.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Clazz {
    @Column(name = "grade_")
    private int grade;
    @Id
    @Column(name = "id_")
    private String id;
    @ManyToMany
    @JoinTable(
            name = "clazz_student",
            joinColumns = {@JoinColumn(name = "clazz_id_")},
            inverseJoinColumns = {@JoinColumn(name = "student_id_")},
            uniqueConstraints = @UniqueConstraint(
                    columnNames = {"clazz_id_", "student_id_"}))
    List<Student>students;
}
