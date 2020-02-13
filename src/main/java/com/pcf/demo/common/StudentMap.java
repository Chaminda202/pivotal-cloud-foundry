package com.pcf.demo.common;

import com.pcf.demo.entity.Student;
import com.pcf.demo.request.StudentRequest;
import com.pcf.demo.response.StudentResponse;

public class StudentMap {
    private StudentMap(){
    }

    public static Student mapStudentRequest(StudentRequest studentRequest) {
        return Student.builder()
                .name(studentRequest.getName())
                .occupation(studentRequest.getOccupation())
                .salary(studentRequest.getSalary())
                .age(studentRequest.getAge())
                .build();
    }

    public static StudentResponse mapStudentResponse(Student student) {
        return StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .occupation(student.getOccupation())
                .salary(student.getSalary())
                .age(student.getAge())
                .build();
    }
}
