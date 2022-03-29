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

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse("http://rss.allocine.fr/ac/cine/prochainement?format=xml");
        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("item");

        for(int i = 0; i < nList.getLength(); i++){
            Film f = new Film();
            Node node = nList.item(i);
            for(int j = 0; j < node.getChildNodes().getLength(); j++) {
                String nodeName = node.getNodeName();
                if (nodeName.equals("title")) {
                    f.setTitre(node.getTextContent());
                }
                if (nodeName.equals("description")) {
                 node.getTextContent().split("-");
                } else{
                }
            }
        }
    }
}
