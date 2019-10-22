import java.util.*;

public class TestToArray {
    public static void main(String args[]) {
        Collection<String> progBands = new HashSet<>();
        progBands.add("Dream Theater");
        progBands.add("Ayreon");
        progBands.add("Yes");
        progBands.add("Spock's Beard");
        progBands.add("Genesis");
        String [] progBandsArray = progBands.toArray(new String[0]);
        for (String progBand : progBandsArray) {
            System.out.println(progBand);
        }
    }
}