package com.demoo.app.services;



import com.demoo.app.model.Student;
import com.demoo.app.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    //Create New student details

    public String createStudent(Student student){
        if(this.studentRepo.existsById(student.getId())){
            return "Student already exists";
        }
        else{
            this.studentRepo.save(student);
            return "Student details are saved.";
        }
    }



    public List<Student> getStudents(){
        return this.studentRepo.findAll();

    }
    public void deletestudent(int id) {

        this.studentRepo.deleteById(id);
        System.out.println("deletedd");
    }


    public void updatee(Student student) {
        this.studentRepo.save(student);
    }


}
