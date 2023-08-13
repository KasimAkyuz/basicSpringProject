package com.akyuz.springdemo.Service;

import com.akyuz.springdemo.Repository.StudentRepository;
import com.akyuz.springdemo.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudenServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudenServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteByEmail(email);

    }

    @Override
    public Student updateStudent(Student student) {

        return studentRepository.save(student);
    }
}
