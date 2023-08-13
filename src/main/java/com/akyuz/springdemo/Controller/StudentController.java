package com.akyuz.springdemo.Controller;

import com.akyuz.springdemo.Service.StudentService;
import com.akyuz.springdemo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> findAllStudent(){
        return  studentService.findAllStudents();
    }
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.save(student);

    }
    @GetMapping("/email")
    public Student getStudent(@PathVariable("email") String email){
        return studentService.findByEmail(email);
    }

    @DeleteMapping("/email")
    public void deleteByEmail(@PathVariable("email") String email){
         studentService.deleteStudent(email);
    }

    @PutMapping()
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

}
