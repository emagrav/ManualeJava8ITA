import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

import java.util.*;
import java.io.*;

public class ParseXML {

  static public void main(String a[]) throws Exception {

    String filename = null;
    boolean dtdValidate = false;
    boolean xsdValidate = false;
    DefaultHandler heandler = new DefaultHandler();

    // controllo argomenti
    if (a.length<1)
      sintax();
    filename = a[0];
    if (a.length>1) {
      if (a[1].equals("-dtd"))
        dtdValidate = true;
      if (a[1].equals("-schema"))
        xsdValidate = true;
    }
    if (a.length>2) {
      heandler = (DefaultHandler)Class.forName(a[2]).newInstance();
    }

    // inizializzazione del parser
    SAXParserFactory spf = SAXParserFactory.newInstance();
    spf.setNamespaceAware(true);
    spf.setValidating(dtdValidate || xsdValidate);
    SAXParser saxParser = spf.newSAXParser();

    // controllo se bisogna usare gli schemi XML
    if (xsdValidate)
      saxParser.setProperty(
        "http://java.sun.com/xml/jaxp/properties/schemaLanguage",
        "http://www.w3.org/2001/XMLSchema"
      );

    // impostazioni per XMLReader
    XMLReader xmlReader = saxParser.getXMLReader();
    xmlReader.setContentHandler(heandler);
    xmlReader.setErrorHandler(new MyErrorHandler());

    // Parsing
    xmlReader.parse(filename);

    System.out.println("Parsing done.");
  }

  private static class MyErrorHandler implements ErrorHandler {

    public void error(SAXParseException exc){
      System.out.println(" Error [line " + exc.getLineNumber() + "]: " + exc.getMessage());
    }

    public void warning(SAXParseException exc) {
      System.out.println(" Warning [line " + exc.getLineNumber() + "]: " + exc.getMessage());
    }

    public void fatalError(SAXParseException spe) {
      System.out.println("Fatal Error");
      System.exit(1);
    }
  }

  private static void sintax() {
    System.err.println("Sintax: ParseXML <filename> [-dtd | -schema | -none] [Handler]");
    System.err.println("        -dtd    = DTD validation");
    System.err.println("        -schema = XML Schema");
    System.err.println("        -none   = No validation");
    System.err.println("        handler = The user defined Handler class");
    System.exit(1);
  }

}