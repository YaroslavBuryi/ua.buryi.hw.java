package ua.buryi.hw8;
class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public double getScholarship() {
        if (averageMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
class Aspirant extends Student {
    private String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    @Override
    public double getScholarship() {
        if (averageMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("John", "Doe", "Group1", 4.5);
        students[1] = new Aspirant("Jane", "Smith", "Group2", 5, "Research on Physics");

        for (Student student : students) {
            System.out.println("Student: " + student.firstName + " " + student.lastName);
            System.out.println("Scholarship: " + student.getScholarship());
            System.out.println();
        }
    }
}
