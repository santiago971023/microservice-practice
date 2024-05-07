package com.microservice.student.service;

import com.microservice.student.entities.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);

}
