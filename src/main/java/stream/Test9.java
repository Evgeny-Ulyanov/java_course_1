package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {

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

//        List<Integer> a = students.stream()
//                .mapToInt(el -> el.getCourse())
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(a);

        int sum = students.stream().mapToInt(el -> el.getCourse()).sum();
        System.out.println(sum);

        Double av = students.stream().mapToInt(el -> el.getCourse()).average().getAsDouble();
        System.out.println(av);

        int min = students.stream().mapToInt(el -> el.getCourse()).max().getAsInt();
        System.out.println(min);

//        Student min =  students.stream().min((x,y) -> x.getAge() - y.getAge()).get();
//        System.out.println(min);
//
//        Student max =  students.stream().max((x,y) -> x.getAge() - y.getAge()).get();
//        System.out.println(max);

//        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
//        System.out.println("________________________________________");
//        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);
//        System.out.println("________________________________________");

    }
}
