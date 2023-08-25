package com.pingwit.core.les_27.classwork.point_1;

import com.pingwit.core.les_27.classwork.entity.EmployeeXml;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParserExample {

    public static final String FILE_PATH = "les_27/employee.xml";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        InputStream resource = ClassLoader.getSystemResourceAsStream(FILE_PATH);

        Document document = documentBuilder.parse(resource);

        List<EmployeeXml> employees = new ArrayList<>();

        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {

            Node node = nodeList.item(i);
            if (node instanceof Element) {
                EmployeeXml employee = new EmployeeXml();
                String id = node.getAttributes().getNamedItem("id").getNodeValue();
                employee.setId(id);

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "firstName":
                                employee.setFirstName(content);
                                break;
                            case "lastName":
                                employee.setLastName(content);
                                break;
                            case "location":
                                employee.setLocation(content);
                                break;
                        }
                    }
                }
                employees.add(employee);
            }
        }

        employees.forEach(System.out::println);
    }
}
