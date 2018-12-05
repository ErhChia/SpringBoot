package com.example.dao;

import com.example.domain.Student;

import java.util.List;

public interface StudentDao {
    void create();

    void insert(Student student);

    void delete(String id);

    void update(Student student);

    List<Student> find();

    Student findOne(Student student);

}
