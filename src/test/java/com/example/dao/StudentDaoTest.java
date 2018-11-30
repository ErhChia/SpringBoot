package com.example.dao;

import com.example.bean.Clazz;
import com.example.bean.Student;
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
    @Test
    public void crud(){
        repository.findAll().forEach(student -> System.out.println(student));
        System.out.println(repository.findByNo("Electric"));
        Clazz clazz=repository.findByIdAndNo("0004","Bob").getClazz();

    }
}
