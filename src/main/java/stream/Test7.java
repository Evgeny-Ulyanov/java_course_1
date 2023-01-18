package stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 2, 6.3);
        Student student2 = new Student("Nik", 'm', 23, 3, 7.3);
        Student student3 = new Student("Elena", 'f', 19, 1, 4.3);
        Student student4 = new Student("Petr", 'm', 35, 4, 9.3);
        Student student5 = new Student("Mariya", 'f', 25, 3, 8.7);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(student1);
        f1.addStudentToFaculty(student2);
        f1.addStudentToFaculty(student3);

        f2.addStudentToFaculty(student4);
        f2.addStudentToFaculty(student5);


        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e -> {
                    System.out.println(e.getName());
                });
    }
}

class Faculty{
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void  addStudentToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}