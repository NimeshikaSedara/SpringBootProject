package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/")
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping("/student-details")
    public ResponseEntity<List<Student>> studentDetails(){

        List<Student> studentList = studentService.getAllStudents();

        if(studentList.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(studentList,HttpStatus.OK);

    }

    @PostMapping("/saveStudent")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student Saved_student = studentService.createStudent(student);
        return new ResponseEntity<Student>(Saved_student, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){

        Student update = studentService.updateStudent(student);
       return new ResponseEntity<Student>(update, HttpStatus.OK);

    }

    @DeleteMapping("/delete")
    public boolean deleteStudent(@RequestBody Student student)
    {
        return studentService.deleteStudent(student);
    }



}
