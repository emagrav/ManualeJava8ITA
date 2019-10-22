import java.util.*;

public class TestCopyLinkedHashSet {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        Set<?> copy = getCopyLinkedHashSet(set);
        copy.forEach(System.out::println);

    }

    public static Set<?> getCopyLinkedHashSet(HashSet<?> set) {
        Set<?> copy = new LinkedHashSet<>(set);
        return copy;
    }
}