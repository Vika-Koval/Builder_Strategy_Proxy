package ucu.apps.edu.ua.task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Vika",LocalDate.now(), "Female", "koval.pn@ucu.edu.ua");
        MailCode code = new BirthdayMail();
        System.out.println(code.generate(client));
        
    }
}