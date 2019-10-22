import java.util.*;
import java.util.stream.*;

public class TestParallelism {
    public static void main(String args[]) {
        List<String> stringhe = new ArrayList<>(Arrays.asList("stringa1","stringa2"));
        String stringaConcatenata = stringhe.stream().peek(s -> stringhe.add("stringa3")).collect(Collectors.joining(", "));
    }
}