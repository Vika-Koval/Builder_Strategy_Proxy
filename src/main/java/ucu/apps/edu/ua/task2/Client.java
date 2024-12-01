package ucu.apps.edu.ua.task2;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString @AllArgsConstructor @Getter
public class Client {
    private static int counter=0;
    private static int id=counter++;
    private String name;
    private LocalDate dob;
    private String gender;
    private String email;
}
