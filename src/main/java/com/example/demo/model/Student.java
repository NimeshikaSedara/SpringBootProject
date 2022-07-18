package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(max = 11,min=11,message = "Student Number should have 11 characters")
    private String studentNumber;
    @NotEmpty
    private String studentName;

    @NotEmpty
    private String city;
    @NotEmpty
    @Email
    private String email;

    public Student() {
    }

    public Student(String studentNumber, String studentName, String city, String email) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.city = city;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){ this.email = email;}
}
