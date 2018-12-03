package com.example.dao;

import com.example.bean.Clazz;
import com.example.bean.Student;
import com.example.repository.ClazzRepository;
import com.example.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class StudentDaoTest {
    @Resource
    private StudentRepository repository;
    @Resource
    private ClazzRepository clazzRepository;
    @Test
    public void crud(){
        clazzRepository.findAll().forEach(clazz -> clazz.getStudents().forEach(student -> System.out.println(student.getId())));

    }
}
