package com.websystem.services;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Date;
import java.util.Properties;

@Service
public class MailNotifications {

    public void sendEmail(String subject, String message) {
        final String fromEmail = "pocztex09876@wp.pl"; //requires valid gmail id
        final String password = "QazWsx0987!"; // correct password for gmail id
        final String toEmail = "pocztex09876@wp.pl"; // can be any email id

        System.out.println("SSLEmail Start");

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.wp.pl"); //SMTP Host
        props.put("mail.smtp.socketFactory.port", "465 "); //SSL Port
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
        props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
        props.put("mail.smtp.port", "587" ); //SMTP Port

        Authenticator auth = new Authenticator() {
            //override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };

        Session session = Session.getDefaultInstance(props, auth);

        try {
            MimeMessage msg = new MimeMessage(session);

            msg.setFrom(new InternetAddress(fromEmail));

            msg.setReplyTo(InternetAddress.parse(fromEmail, false));

            msg.setSubject(subject, "UTF-8");
            msg.setDescription("Description");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(message);

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            msg.setSentDate(new Date());
            msg.setContent(multipart);

            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));

            // Create the message body part

            // Fill the message

            Transport.send(msg);
            System.out.println("Email Sent Successfully with attachment!!");
        } catch (
                MessagingException e) {
            e.printStackTrace();


        }
    }
}
