package api.controllers;

import business.abstarcts.StudentService;
import entities.Student;

import java.util.List;

public class StudentController {

    private final  StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService=studentService;

    }
    public void add(Student student){
        studentService.add(student);
    }
    public void delete(int studentNo){
        studentService.delete(studentNo);
    }
    public List<Student> getAll(){
        return studentService.getAll();
    }
}
