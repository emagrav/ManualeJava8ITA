import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

public class DomCreator {
    public static void main(String[] args) {
        Document doc = parseXmlFile("eje.xml", false);
        NodeList list = doc.getElementsByTagName("*");
        for (int i=0; i<list.getLength(); i++) {
            Element element = (Element)list.item(i);// deve essere per forza ricorsivo!
            if (element.getNodeType() == Node.TEXT_NODE)
            System.out.println(element.getTextContent());
            else System.out.println(element.getNodeType());
        }
    }
    // Parses an XML file and returns a DOM document.
    // If validating is true, the contents is validated against the DTD
    // specified in the file.
    public static Document parseXmlFile(String filename, boolean validating) {
        try {
            // Create a builder factory
            DocumentBuilderFactory factory =
            DocumentBuilderFactory.newInstance();
            factory.setValidating(validating);
            // Create the builder and parse the file
            Document doc = factory.newDocumentBuilder().parse(new
            File(filename));
            return doc;
        } catch (SAXException e) {
            // A parsing error occurred; the xml input is not valid
        } catch (ParserConfigurationException e) {
        } catch (IOException e) {
        }
        return null;
    }
}