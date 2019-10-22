import java.util.*;
import java.util.stream.*;

public class TestCollectors {
    public static void main(String args[]) {
        Collection<Smartphone> smartphones = getSmartphones();
        List<String> modelli = smartphones.stream().map(Smartphone::getModello).collect(Collectors.toList());
        modelli.forEach(System.out::println);
        System.out.println();
        Set<String> marche = smartphones.stream().map(Smartphone::getMarca).collect(Collectors.toCollection(TreeSet::new));
        marche.forEach(System.out::println);
        String modelliConSeparatore = smartphones.stream().map(Smartphone::toString).collect(Collectors.joining("; "));
        System.out.println(modelliConSeparatore);
        System.out.println();
        Map<String, List<Smartphone>> map = smartphones.stream().collect(Collectors.groupingBy(Smartphone::getMarca));
        System.out.println(map);

        DoubleSummaryStatistics stats = smartphones.stream().collect(Collectors.summarizingDouble(Smartphone::getPrezzo));        
        System.out.println(stats);
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