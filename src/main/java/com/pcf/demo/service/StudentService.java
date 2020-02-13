package com.pcf.demo.service;

import com.pcf.demo.entity.Student;
import com.pcf.demo.response.StudentResponse;

public interface StudentService {
    StudentResponse create(Student student);
    StudentResponse get(Integer id);
    void delete(Integer id);
    StudentResponse update(Integer id, Student student);
}
