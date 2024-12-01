package ucu.apps.edu.ua.task2;


public class BirthdayMail implements MailCode {
    public String generate(Client client) {
        return String.format("%s happy birthday", client.getName());
    }
}
