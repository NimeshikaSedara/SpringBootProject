package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface StudentService {




    List<Student> getAllStudents();

    Student createStudent(Student student);

    Student updateStudent(Student student);

    boolean deleteStudent(Student student);




}
