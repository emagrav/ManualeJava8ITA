import java.util.*;

public class Ternary {
    public static void main(String args[]) {
        String s = "14/04/04";
        Date today = new Date();
        boolean flag = true;
        Object obj = flag ? s : today; 
    }
}