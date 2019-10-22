import java.util.*;

public class TestLinkedHashSet {
    public static void main(String args[]) {
        Set<String> set = new LinkedHashSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("b");
        set.forEach(System.out::println);
    }
}