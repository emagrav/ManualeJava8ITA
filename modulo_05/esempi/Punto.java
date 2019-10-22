
public class Punto {
    private int x, y;
    private final int VALORE_MASSIMO_PER_X=10 ;
    private final int VALORE_MINIMO_PER_X=-10 ;
    private final int VALORE_MASSIMO_PER_Y=10 ;
    private final int VALORE_MINIMO_PER_Y=-10 ;
    public void setX(int a) {
        if (a <= VALORE_MASSIMO_PER_X && a >= VALORE_MINIMO_PER_X) {
            x = a;
            System.out.println("X è OK!");
        }
        else {
            System.out.println("X non valida");
        }
    }
    public void setY(int a) {
        if (a <= VALORE_MASSIMO_PER_Y && a >= VALORE_MINIMO_PER_Y) {
            y = a;
            System.out.println("Y è OK!");
        }
        else {
            System.out.println("Y non valida");
        }
    }
    //   . . .
}