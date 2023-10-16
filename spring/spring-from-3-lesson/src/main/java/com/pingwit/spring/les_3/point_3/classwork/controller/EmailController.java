package com.pingwit.spring.les_3.point_3.classwork.controller;

import com.pingwit.spring.les_3.point_3.classwork.converter.EmailConverter;
import com.pingwit.spring.les_3.point_3.classwork.dto.EmailDto;
import com.pingwit.spring.les_3.point_3.classwork.model.Email;
import com.pingwit.spring.les_3.point_3.classwork.service.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;
    private final EmailConverter emailConverter;

    public EmailController(EmailService emailService, EmailConverter emailConverter) {
        this.emailService = emailService;
        this.emailConverter = emailConverter;
    }

    @PostMapping("/send")
    public void send(@RequestBody EmailDto dto) {
        Email email = emailConverter.toModel(dto);
        emailService.send(email);
    }
}
