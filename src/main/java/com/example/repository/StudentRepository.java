package com.example.repository;

import com.example.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    Student findByNo(String no);

    Student findByIdAndNo(String id, String no);
}
