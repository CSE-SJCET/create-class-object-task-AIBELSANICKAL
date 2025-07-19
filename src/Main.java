public class Student {
    String name;
    int rollNumber;
    char grade;


    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
     
public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Aibel Anickal";
        student.rollNumber = 101;
        student.grade = 'A';
        student.displayDetails();
    }
}
