package com.pingwit.core.les_27.classwork.point_1;

import com.pingwit.core.les_27.classwork.entity.EmployeeXml;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxParserExample {
    public static final String FILE_PATH = "les_27/employee.xml";

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        List<EmployeeXml> employees = new ArrayList<>();
        EmployeeXml cur = null;
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PATH);
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(resource);
        while (xmlEventReader.hasNext()) {
            XMLEvent xmlEvent = xmlEventReader.nextEvent();
            /*
                int event = xmlEventReader.next();
                switch(event){
                    case START_ELEMENT: ...
                }
             */
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();
                String localPart = startElement.getName().getLocalPart();
                if (localPart.equals("employee")) {
                    cur = new EmployeeXml();
                    Attribute id = startElement.getAttributeByName(new QName("id"));
                    if (id != null) {
                        cur.setId(id.getValue());
                    }
                } else {
                    switch (localPart) {
                        case "firstName" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            cur.setFirstName(xmlEvent.asCharacters().getData());
                        }
                        case "lastName" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            cur.setLastName(xmlEvent.asCharacters().getData());
                        }
                        case "location" -> {
                            xmlEvent = xmlEventReader.nextEvent();
                            cur.setLocation(xmlEvent.asCharacters().getData());
                        }
                    }
                }
            }
            if (xmlEvent.isEndElement()) {
                EndElement endElement = xmlEvent.asEndElement();
                if (endElement.getName().getLocalPart().equals("employee")) {
                    employees.add(cur);
                }
            }
        }
        System.out.println(employees);
    }
}
