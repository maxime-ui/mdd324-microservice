package com.ipiecoles.java.mdd324;

import com.ipiecoles.java.mdd324.POJO.Film;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        Service_Films service_films = new Service_Films();
        try {
            System.out.println(service_films.xmlToJson());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
