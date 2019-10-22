import java.util.*;

public class TestIterator {
    public static void main(String args[]) {
        Collection<String> progBands = new HashSet<>();
        progBands.add("Dream Theater");
        progBands.add("Ayreon");
        progBands.add("Yes");
        progBands.add("Spock's Beard");
        progBands.add("Genesis");
        Iterator<String> iterator = progBands.iterator();
        System.out.println(iterator.getClass().getName());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}