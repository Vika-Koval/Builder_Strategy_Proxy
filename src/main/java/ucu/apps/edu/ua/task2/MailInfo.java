package ucu.apps.edu.ua.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailCode;
    public String generate() {
        return mailCode.generate(client);
    }
}
