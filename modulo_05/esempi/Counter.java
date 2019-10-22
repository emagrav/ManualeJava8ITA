
import static java.sql.DriverManager.getConnection;
import static java.lang.System.out;

public class Counter {
    private static int counter = 0;
    private int number;
    
    public Counter() {
        counter++;
        setNumber(counter);
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
