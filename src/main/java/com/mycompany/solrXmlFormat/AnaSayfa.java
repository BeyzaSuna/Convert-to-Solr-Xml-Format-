/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrXmlFormat;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
/**
 *
 * @author beyza.suna
 */
public class AnaSayfa {
    public static void main(String[] args) {
        try {
         //File xmlFile = new File("/home/beyza.suna/Desktop/ornek.xml");
         File f = new File("src/main/resources/ornek.xml");
         String xmlFile=f.getAbsoluteFile().getAbsolutePath();
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         Handler handler=new Handler();
         saxParser.parse(xmlFile, handler);
                 
         
      } catch (Exception e) {
         e.printStackTrace();
      }

    }
}
