package learn.java.oop.DesignPattern.StructuralPatterns.DAOPattern;

public class Demo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //Print all students
        for (Student student : studentDao.getAllStudent()) {
            System.out.println(
                    "Student Name :  " + student.getName() +
                            "Student Number :  " + student.getRoolNo()
            );
        }

        //Update student
        Student student = studentDao.getStudent(0);
        student.setName("AA");
        student.setName("BB");
        student.setName(studentDao.getStudent(1).getName());
        student.setRoolNo(1);
        System.out.println(studentDao.getStudent(0).getName());
        studentDao.updateStudent(student);
        // delete student
        Student student2 = studentDao.getStudent(0);
        studentDao.deleteStudnt(student2);
    }

}
