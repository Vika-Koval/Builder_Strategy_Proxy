package ucu.apps.edu.ua.task1;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Student student = Student.builder()
        .firstName("John")
        .lastName("Doe")
        .grades(Arrays.asList(90, 85, 78))
        .grade(10)
        .age(20)
        .height(175)
        .group("A1")
        .build();
        System.out.println(student.getFirstName());
    }
}
