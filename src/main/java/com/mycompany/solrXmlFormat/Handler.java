/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.solrXmlFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
/**
 *
 * @author beyza.suna
 */
public class Handler extends DefaultHandler {
    private StringBuffer stringBuffer = new StringBuffer();

     @Override
    public void startDocument () {
      stringBuffer.append("<add>");  
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes1) { // <...> ifadesini okursa burayı çalıştırır.
       
        try {
            if (qName.equalsIgnoreCase("kitaplık")){
            }else if (qName.equalsIgnoreCase("kitap")) {
                stringBuffer.append("<doc>");            
            }
            else
                stringBuffer.append("<field name=\""+qName+"\">");
            } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void characters(char[] chars, int start, int length) { // <...> </...> ifadeleri dışında bir ifade okursa burayı çalıştırır.
      
                stringBuffer.append(new String(chars, start, length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) { // </...> ifadesini okursa burayı çalıştırır.
        try {
            if (qName.equalsIgnoreCase("kitaplık")) {//bir şey yapmasın diye
            } 
            else if (qName.equalsIgnoreCase("kitap")) {
                stringBuffer.append("</doc>");
            }            
            else {
                stringBuffer.append("</field>");
            }
             } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void endDocument() { // Dosya sonu geldiğinde burayı çalıştırır.
        stringBuffer.append("</add>");
        try {
            usingBufferedWritter(stringBuffer);
        } catch (IOException ex) {
            Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void usingBufferedWritter(StringBuffer stringBuffer) throws IOException{
        BufferedWriter bufferedwriter=new BufferedWriter (new FileWriter("/home/beyza.suna/Downloads/solr-8.2.0/example/exampledocs/output.xml"));        
        bufferedwriter.write(stringBuffer.toString());
        bufferedwriter.close();
    }
}
