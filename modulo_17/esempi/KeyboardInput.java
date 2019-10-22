import java.io.*;
import java.util.stream.*;
import java.util.*;
import java.net.*;
public class KeyboardInput {
    public static void main (String args[]) throws IOException{
      URL url = new URL("http://www.claudiodesio.com");
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
         Stream<String> lines = reader.lines();
         Optional<String> claudio = lines.filter(s -> s.contains("claudio")).findFirst();
         claudio.ifPresent(System.out::println);
      }
        
        String stringa = null;
        System.out.println("Digita qualcosa e premi invio...\nPer terminare il programma digitare \"fine\"");
        try (InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir)) {
            stringa = in.readLine();
            while ( stringa != null ) {
                if (stringa.equals("fine")) {
                    System.out.println("Programma terminato");
                    break;
                }
                System.out.println("Hai scritto: "+ stringa);
                stringa = in.readLine();
            }
        }
    }
}