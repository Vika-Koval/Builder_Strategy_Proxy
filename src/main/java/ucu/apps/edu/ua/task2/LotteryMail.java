package ucu.apps.edu.ua.task2;


public class LotteryMail implements MailCode {
    public String generate(Client client) {
        return String.format("%s, YOU WON $1000000", client.getName());
    }
}