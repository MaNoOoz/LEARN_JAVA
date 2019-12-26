package learn.java.oop.DesignPattern.StructuralPatterns.DAOPattern;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudent();

    Student getStudent(int roolNo);

    void updateStudent(Student student);

    void deleteStudnt(Student student);
}
