package esempi;
public class ChildInitializer extends ParentInitializer {
    public ChildInitializer (){
        System.out.println("Costruttore di ChildInitializer");
    }
    {
        System.out.println("Inzializzatore d'istanza di ChildInizializer");
    }

    static {
        System.out.println("Inizializzatore statico di ChildInizializer");
    }
    public static void main(String args[]) {
        new ChildInitializer();
    }
}
