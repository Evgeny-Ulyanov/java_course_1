package generix.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 23);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("fgdfhg", 25);
        Schoolar schoolar4 = new Schoolar("нгкигш", 16);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Drakony");
        Team<Schoolar> schoolarTeam2 = new Team<>("M");
        Team<Student> studentTeam = new Team<>("Vpered");
        Team<Employee> employeeTeam = new Team<>("Rabotyagi");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
//        schoolarTeam.addNewParticipant(student1);
//        schoolarTeam.addNewParticipant(employee1);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
