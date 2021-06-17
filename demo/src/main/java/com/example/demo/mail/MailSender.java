package com.example.demo.mail;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class MailSender {

    public JavaMailSender getJavaMailSender(){
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("smtp.aspmvc.projekt@gmail.com");
        mailSender.setPassword("x%^zucywa,Ya");

        Properties properties = mailSender.getJavaMailProperties();
        properties.put("mail.transport.protocol","smtp");
        properties.put("mail.smth.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.debug","true");

        return mailSender;
    }

    public void sendSimpleMessage(String toEmail, String Subject, String Message){
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setFrom("smtp.aspmvc.projekt@gmail.com");
        sms.setTo(toEmail);
        sms.setSubject(Subject);
        sms.setText(Message);
        this.getJavaMailSender().send(sms);
    }
}
