package lambda;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> arrayList, Predicate<Student> studentPredicate){
        for (Student s : arrayList) {
            if (studentPredicate.test(s)) {
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> arrayList, double grade) {
//        for (Student s : arrayList) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//
//    }
//    void printStudentsUnderAge(ArrayList<Student> arrayList, int age) {
//        for (Student s : arrayList) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex) {
//        for (Student s : arrayList) {
//            if (s.age < age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
    }


class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 2, 6.3);
        Student student2 = new Student("Nik", 'm', 23, 3, 7.3);
        Student student3 = new Student("Elena", 'f', 19, 1, 4.3);
        Student student4 = new Student("Petr", 'm', 35, 4, 9.3);
        Student student5 = new Student("Mariya", 'f', 25, 3, 8.7);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        StudentInfo info = new StudentInfo();

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });

//        Collections.sort(students, (s1, s2) -> s1.course - s2.course);

//        info.testStudents(students, new CheckOverGrade());

//        System.out.println("___________________________");
//
//        info.testStudents(students, (Student s) -> s.age < 25);
//
//        System.out.println("___________________________");
//
//        info.testStudents(students, s -> s.avgGrade > 8);
//
//        System.out.println("___________________________");
//
//        info.testStudents(students, (Student s) -> s.age > 20 && s.avgGrade < 9 && s.sex == 'f');

//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(students, p1.negate());

        Function<Student, Double> f = student -> student.avgGrade;

        double res = avgOfSmth(students, stud -> (double) stud.course);
        System.out.println(res);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {

        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;

    }
}

//interface StudentChecks{
//    boolean check(Student student);
//}

//class CheckOverGrade implements StudentChecks{
//
//    @Override
//    public boolean check(Student student) {
//        return student.avgGrade > 8;
//    }
//}
