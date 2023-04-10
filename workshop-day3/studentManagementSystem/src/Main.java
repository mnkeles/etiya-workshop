import api.controllers.StudentController;
import business.abstarcts.StudentService;
import business.concretes.StudentManager;
import entities.Student;
import repository.abstracts.StudentRepository;

public class Main {
    public static void main(String[] args) {
        //StudentRepository studentRepository = null;
        StudentService studentService=new StudentManager();

        /*studentService.studentList.add(new Student("Necati", "Keleş", 1, "10", "Ankara"));
        studentService.studentList.add(new Student("Necati2", "Keleş2", 2, "20", "Ankara2"));
        studentService.studentList.add(new Student("Necati3", "Keleş3", 3, "30", "Ankara3"));



         */

        StudentController studentController = new StudentController(studentService);
        Student student = new Student("Necati1", "Keleş1", 1, "10", "Ankara1");
        Student student1 = new Student("Necati4", "Keleş4", 4, "40", "Ankara4");
        Student student2 = new Student("Necati5", "Keleş5", 5, "50", "Ankara5");

        studentController.add(student);
        studentController.add(student1);
        studentController.add(student2);

        studentController.delete(2);

        for (Student std : studentController.getAll()) {
            System.out.println(std.getFirstName() + ":" + std.getStundentNo());
        }
    }
}