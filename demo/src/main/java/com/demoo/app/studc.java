package com.demoo.app;

import com.demoo.app.model.Student;
import com.demoo.app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studc {
    @RequestMapping("/")
    public String hello()
    {
        return "Hello javaTpoint";
    }
    @Autowired
    private StudentService studentService;


    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){
        return this.studentService.getStudents();
    }
    @PostMapping("/createstudent")
    public String createStudent(@RequestBody Student student){
        return this.studentService.createStudent(student);
    }


    @DeleteMapping("/deletee/{id}")
    public void deletestudent(@PathVariable("id") int id) {
        studentService.deletestudent(id);
    }
    @PutMapping("/update")
    public void updatee(@RequestBody Student student) {
    }
}
