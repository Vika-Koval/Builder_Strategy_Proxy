package ucu.apps.edu.ua.task1;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter @ToString @SuperBuilder
public class Student extends Human{
    @Singular
    private List<Integer> grades;
    private String group;
    private int age;
    private int height;
}
