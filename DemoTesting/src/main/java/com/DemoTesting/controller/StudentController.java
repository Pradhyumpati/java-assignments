package com.DemoTesting.controller;

import com.DemoTesting.entitty.student;
import com.DemoTesting.service.studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Demo")
public class StudentController {
    @Autowired
    private studentservice studentService;
    @GetMapping("/getAll")
    public List<student> getAllStudent() {

        return studentService.getAllStudent();
    }
    @GetMapping("/getById/{id}")
    public student getStudent(@PathVariable("id") int id) {

        return studentService.getStudent(id);
    }
    @PostMapping("/add")
    public String addStudent(@RequestBody student st) {

        return studentService.addStudent(st);
    }

    @PutMapping("/Update/{id}")
    public String updateStudent(@RequestBody student st, @PathVariable("id") int id) {
        return studentService.updateStudent(st,id);
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {

        return this.studentService.deleteStudent(id);
    }


}