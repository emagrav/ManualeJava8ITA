package esempi;
public class ParentInitializer {
    public ParentInitializer () {
        System.out.println("Costruttore di ParentInitializer");
    }
    {
        System.out.println("Inzializzatore d'istanza di ParentInizializer");
    }

    static {
        System.out.println("Inizializzatore statico di ParentInizializer");
    }
}
