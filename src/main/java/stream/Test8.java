package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 'm', 22, 2, 6.3);
        Student student2 = new Student("Nik", 'm', 23, 3, 7.3);
        Student student3 = new Student("Elena", 'f', 19, 1, 4.3);
        Student student4 = new Student("Petr", 'm', 35, 4, 9.3);
        Student student5 = new Student("Mariya", 'f', 25, 3, 8.7);

        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        Map<Integer, List<Student>> integerListMap = students.stream().map(el -> {
//            el.getName().toUpperCase();
//            return el;
//        }).collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        System.out.println(integerListMap);

        Map<Boolean, List<Student>> integerListMap =
                students.stream().collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        System.out.println(integerListMap);

    }
}
