package ucu.apps.edu.ua.task2;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    private MailSender mailSender;
    void addMailInfo(MailInfo mail) {
        infos.add(mail);
    }
    void sendAll() {
        for(MailInfo mail: infos) {
            mailSender.sendMail(mail);
        }
    }
}
