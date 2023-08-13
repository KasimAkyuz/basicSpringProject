package com.akyuz.springdemo.Repository;

import com.akyuz.springdemo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByEmail(String email);
    Student deleteByEmail(String email);
}
