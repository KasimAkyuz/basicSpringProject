package com.akyuz.springdemo.Service;

import com.akyuz.springdemo.student.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    List<Student> findAllStudents();
    Student findByEmail(String email);
    void deleteStudent(String email);
    public Student updateStudent(Student student);

}
