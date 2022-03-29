package com.ipiecoles.java.mdd324;
import com.ipiecoles.java.mdd324.POJO.Film;
import com.owlike.genson.Genson;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service_Films {
    public static String xmlToJson() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse("http://rss.allocine.fr/ac/cine/prochainement?format=xml");
        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("item");
        List<Film> listFilm = new ArrayList<>();

        for (int i = 0; i < nList.getLength(); i++) {
            Film f = new Film();
            Node node = nList.item(i);

            for (int j = 0; j < node.getChildNodes().getLength(); j++) {
                Node child = node.getChildNodes().item(j);
                String nodeName = child.getNodeName();

                if (nodeName.equals("title")) {
                    f.setTitle(child.getTextContent());
                }
                if (nodeName.equals("description")) {
                    String[] splitString = child.getTextContent().split(" - ");
                    String filmCategories = splitString[0];
                    String filmDescription = splitString[1].replace("</p><p>"," ");

                    if (filmCategories.indexOf(" (") != -1) {
                        String filmCategoriesClean = filmCategories.substring(0, filmCategories.indexOf(" ("));
                        filmCategories = filmCategoriesClean.substring(3);
                    }
                    f.setDescription(filmDescription);
                    f.setCategorie(filmCategories);
                }
            }
            listFilm.add(f);
        }
        String ProchainesSorties = new Genson().serialize(listFilm);
        return ProchainesSorties;
    }
}

