package com.pcf.demo.controller;

import com.pcf.demo.common.StudentMap;
import com.pcf.demo.request.StudentRequest;
import com.pcf.demo.response.StudentResponse;
import com.pcf.demo.service.StudentService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController(value = "/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @ApiOperation(value = "Add a Student")
    @PostMapping
    public ResponseEntity<StudentResponse> create(@RequestBody StudentRequest studentRequest){
        return ResponseEntity
                .ok()
                .body(this.studentService.create(StudentMap.mapStudentRequest(studentRequest)));
    }

    @GetMapping
    public ResponseEntity<StudentResponse> get(@RequestParam("id") Integer id){
        return ResponseEntity.ok().body(this.studentService.get(id));
    }

    @PutMapping
    public ResponseEntity<StudentResponse> update(@RequestParam("id") Integer id, @RequestBody StudentRequest studentRequest){
        return ResponseEntity
                .ok()
                .body(this.studentService.update(id, StudentMap.mapStudentRequest(studentRequest)));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam("id") Integer id){
        this.studentService.delete(id);
        return ResponseEntity
                .noContent()
                .build();
    }
}
