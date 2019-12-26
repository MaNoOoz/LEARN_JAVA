package learn.java.oop.DesignPattern.StructuralPatterns.DAOPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    // fake  database
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        Student student3 = new Student("John2", 12);
        Student student4 = new Student("John3", 13);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
    }

    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRoolNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRoolNo() + ", updated in the database");
    }

    @Override
    public void deleteStudnt(Student student) {
        students.remove(student.getRoolNo());
        System.out.println("Student: Roll No " + student.getRoolNo() + ", deleted from database");
    }
}
