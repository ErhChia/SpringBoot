package com.example.service.impl;

import com.example.domain.Student;
import com.example.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
//    @Resource
//    private StudentDao dao;

    @Override
    public void create() {
//        dao.create();
    }

    @Override
    public void insert(Student student) {
//        dao.insert(student);

    }

    @Override
    public void delete(String id) {

//        dao.delete(id);
    }

    @Override
    public void update(Student student) {

//        dao.update(student);
    }

    @Override
    public List<Student> find() {
        return
                null;
    }

    @Override
    public Student findOne(Student student) {

        return
                null;
    }
}
