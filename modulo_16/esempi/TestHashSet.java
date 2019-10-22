import java.util.*;
public class TestHashSet {
    public static void main(String args[]) {
        Set<String> set = new HashSet<>();
        set.add("c");
        set.add("josdj");
        set.add("b");
        set.add("ksdo");
        set.add("dksdj");
        set.forEach(System.out::println);
    }
}