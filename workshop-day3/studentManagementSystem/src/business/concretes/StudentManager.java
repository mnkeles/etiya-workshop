package business.concretes;

import business.abstarcts.StudentService;
import entities.Student;
import repository.abstracts.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentService {

    public List<Student> studentList=new ArrayList<>();

    private StudentRepository studentRepository;
    public StudentManager() {
        studentList.add(new Student("Necati", "Keleş", 1, "10", "Ankara"));
        studentList.add(new Student("Necati2", "Keleş2", 2, "20", "Ankara2"));
        studentList.add(new Student("Necati3", "Keleş3", 3, "30", "Ankara3"));

    }

    @Override
    public void add(Student student) {
        for (Student student1 : studentRepository.studentList) {
            if (student.getStundentNo() == student1.getStundentNo()) {
                System.out.println("Hata --> studentNo : " + student.getStundentNo() + " mevcut");
                return;
            }
        }
        studentRepository.studentList.add(student);
        System.out.println(student.getFirstName() + "  Eklendi");

    }

    @Override
    public void delete(int studentNo) {
        for (Student student : StudentRepository.studentList) {
            if (studentNo == student.getStundentNo()) {
                studentRepository.studentList.remove(student);
                break;
            }
        }
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.studentList;
    }
}
