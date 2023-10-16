package com.pingwit.spring.les_3.point_3.classwork.converter;

import com.pingwit.spring.les_3.point_3.classwork.dto.EmailDto;
import com.pingwit.spring.les_3.point_3.classwork.model.Email;
import org.springframework.stereotype.Component;

@Component
public class EmailConverter {

    public Email toModel(EmailDto dto) {
        return new Email(dto.to(), dto.subject(), dto.text());
    }
}
