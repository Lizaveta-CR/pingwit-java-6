package com.pingwit.core.les_27.classwork.point_1;

import com.pingwit.core.les_27.classwork.entity.EmployeeXml;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserExample {
    public static final String FILE_PATH = "les_27/employee.xml";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = parserFactory.newSAXParser();

        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PATH);
        SAXHandler handler = new SAXHandler();
        saxParser.parse(resource, handler);

        handler.getEmployees().forEach(System.out::println);
    }
}

class SAXHandler extends DefaultHandler {

    private List<EmployeeXml> employees = new ArrayList<>();
    private EmployeeXml cur = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "employee":
                cur = new EmployeeXml();
                cur.setId(attributes.getValue("id"));
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "firstName":
                cur.setFirstName(content);
                break;
            case "lastName":
                cur.setLastName(content);
                break;
            case "location":
                cur.setLocation(content);
                break;
            case "employee":
                employees.add(cur);
        }
    }

    public List<EmployeeXml> getEmployees() {
        return employees;
    }
}
