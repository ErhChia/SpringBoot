package com.example.repository;

import com.example.bean.Clazz;
import com.example.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,String> {
    Student findByNo(String no);
    Student findByIdAndNo(String id,String no);
}
