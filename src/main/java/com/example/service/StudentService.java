package com.example.service;

import com.example.domain.Student;

import java.util.List;

public interface StudentService {
    void create();

    void insert(Student student);

    void delete(String id);

    void update(Student student);

    List<Student> find();

    Student findOne(Student student);
}
