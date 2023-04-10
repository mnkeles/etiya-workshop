package business.abstarcts;

import entities.Student;

import java.util.List;

public interface StudentService {
    void add(Student student);
    void delete(int studentNo);
    List<Student> getAll();
}
