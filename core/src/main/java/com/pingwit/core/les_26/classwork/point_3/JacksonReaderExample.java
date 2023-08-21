package com.pingwit.core.les_26.classwork.point_3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingwit.core.les_26.classwork.entity.Pingwit;
import com.pingwit.core.les_26.classwork.entity.PingwitShorten;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JacksonReaderExample {

    private static final String FILE_PATH = "json/les_26/pingwit.json";
    private static final String FILE_PATH_ARRAY = "json/les_26/array-pingwit.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PATH);
        Pingwit pingwit = objectMapper.readValue(resource, Pingwit.class);
        System.out.println(pingwit);

        resource = ClassLoader.getSystemResourceAsStream(FILE_PATH);
        PingwitShorten pingwitShorten = objectMapper.readValue(resource, PingwitShorten.class);
        System.out.println(pingwitShorten);

        resource = ClassLoader.getSystemResourceAsStream(FILE_PATH_ARRAY);
        List<Pingwit> pingwits = objectMapper.readValue(resource, new TypeReference<>() {});

        System.out.println(pingwits);
    }
}
