package com.pingwit.core.les_27.classwork.point_2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.pingwit.core.les_27.classwork.entity.EmployeeXml;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JacksonXmlParserExample {
    public static final String FILE_PATH = "les_27/employee.xml";

    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PATH);

        List<EmployeeXml> employees = xmlMapper.readValue(resource, new TypeReference<>() {});
        employees.forEach(System.out::println);
    }
}
