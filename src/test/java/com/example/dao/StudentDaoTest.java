package com.example.dao;

import com.example.bean.Student;
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
    private StudentDao dao;
    @Test
    public void crud(){
        dao.create();
        Student student=new Student();
        student.setId("t226");
        student.setNo("sungyeh");
        dao.insert(student);
        student.setId("t227");
        dao.insert(student);
        Student target=dao.findOne(student);
        assertThat(target).isNotNull();
        System.err.println(target);
        assertThat(dao.find()).hasSize(2);
        dao.delete("t226");
        assertThat(dao.find()).hasSize(1);
        student.setId("t227");
        student.setNo("tttttt");
        dao.update(student);
        System.err.println(dao.findOne(student));

    }
}
