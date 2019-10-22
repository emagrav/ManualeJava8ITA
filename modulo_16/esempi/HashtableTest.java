import java.util.*;
public class HashtableTest {
    public static void main(String args[]) {
        HashMap<Integer,String> table = new HashMap<>();
        table.put(2006,"Simone");
        table.put(2004, "Andrea");
        System.out.println(table.get(2004));
        System.out.println(table.get(2006));
    }
}