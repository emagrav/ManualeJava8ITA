package esempi;
public class Cliente2 extends Persona {
    private String indirizzo, telefono;
    public String toString() {
        return super.toString()+ "\n"+
        indirizzo + "\nTel:" + telefono;
    }

    //accessor e mutator methods (set e get)
}