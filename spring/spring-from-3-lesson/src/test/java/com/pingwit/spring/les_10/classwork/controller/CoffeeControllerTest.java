package com.pingwit.spring.les_10.classwork.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingwit.spring.les_10.classwork.dto.CoffeeDto;
import com.pingwit.spring.les_10.classwork.entity.Coffee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class CoffeeControllerTest {

    private final ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    private MockMvc mockMvc;

    @Test
    void order() throws Exception {
        //given
        CoffeeDto dto = new CoffeeDto(Coffee.ESPRESSO, 100, false);
        String expected = "your order is ready: 100ml ESPRESSO without sugar";

        //when
        MockHttpServletRequestBuilder post = MockMvcRequestBuilders
            .post("/coffee")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(dto));

        MvcResult result = mockMvc.perform(post)
            .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
            .andReturn();

        //then
        assertEquals(expected, result.getResponse().getContentAsString());
    }
}
