package com.pingwit.core.les_26.classwork.point_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pingwit.core.les_26.classwork.entity.Pingwit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class JacksonWriterExample {
    private static final String FILE_PATH = "json/les_26/pingwit.json";
    private static final String FILE_WITH_OBJECT = "array-pingwit.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PATH);
        Pingwit pingwit = objectMapper.readValue(resource, Pingwit.class);
        String pingwitToString = objectMapper.writeValueAsString(pingwit);
        System.out.println(pingwitToString);

        File file = new File(FILE_WITH_OBJECT);
        objectMapper.writeValue(file, pingwit);
    }
}
