package com.pingwit.spring.les_3.point_3.classwork.service;

import com.pingwit.spring.les_3.point_3.classwork.config.MailProperty;
import com.pingwit.spring.les_3.point_3.classwork.model.Email;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender javaMailSender;
    private final MailProperty mailProperty;

    public EmailService(JavaMailSender javaMailSender, MailProperty mailProperty) {
        this.javaMailSender = javaMailSender;
        this.mailProperty = mailProperty;
    }

    public void send(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(mailProperty.getFrom());
        message.setTo(email.to());
        message.setSubject(email.subject());
        message.setText(email.text() + mailProperty.getSignature());

        javaMailSender.send(message);
    }
}
