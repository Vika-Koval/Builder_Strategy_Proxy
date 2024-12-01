package ucu.apps.edu.ua.task2;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        final String username="USERNAME";
        final String password="PASSWORD";
        final String smtpHost = "SmtpHost";
        final String smtpPort = "SmtpPort";
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailInfo.getClient().getEmail()));
            message.setSubject("hello");
            message.setText("hello");
            Transport.send(message);
            System.out.println("Email sent successfully");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Error sending email:"+e);
        }
    }
}