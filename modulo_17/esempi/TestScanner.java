import java.util.*;

public class TestScanner {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String testoDigitato = "";
            while (sc.hasNext()) {
                testoDigitato += sc.next();
                System.out.println(testoDigitato);
            }
        }
    }
}