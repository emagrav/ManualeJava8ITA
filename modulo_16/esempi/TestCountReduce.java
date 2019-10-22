import java.util.*;

public class TestCountReduce {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        long count = smartphones.stream().filter(s -> s.getMarca().equals("Samsung")).count();
        System.out.println(count);
        long prezzoTotale = smartphones.stream().filter(s -> s.getMarca().equals("Samsung")).map(Smartphone::getPrezzo).reduce(0, (x,y) -> x+y);
        System.out.println(prezzoTotale);        
    }

    public static Collection<Smartphone> getSmartphones() {
        Collection<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone("Samsung","Note 3", 620));
        smartphones.add(new Smartphone("Apple","Iphone 55",721));
        smartphones.add(new Smartphone("HTC","One M8",700));
        smartphones.add(new Smartphone("Samsung","S 5", 700));
        smartphones.add(new Smartphone("Samsung","Ace", 125));
        smartphones.add(new Smartphone("Samsung","Grand", 310));
        smartphones.add(new Smartphone("Samsung","Young", 80));
        smartphones.add(new Smartphone("Samsung","Express", 70)); 
        return smartphones;
    }
}