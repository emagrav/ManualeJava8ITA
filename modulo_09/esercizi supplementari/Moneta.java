
/**
 * Questa classe astrae il concetto di Moneta.
 *
 * @author Claudio De Sio Cesari
 */
public class Moneta {

    /**
     * La valuta è una costante settata al valore EURO.
     */
    public final static String VALUTA = "EURO";

    /**
     * Rappresenta il valore della moneta in centesimi.
     */
    private final Valore valore;

    /**
     * Costruttore che prende in input il valore della moneta.
     *
     * @param valore il valore della moneta.
     */
    public Moneta(Valore valore) {
        this.valore = valore;
        System.out.println("Creata una " + getDescrizione());
    }

    /**
     * Restituisce il valore della variabile d'istanza valore.
     *
     * @return il valore della variabile d'istanza valore.
     */
    public Valore getValore() {
        return valore;
    }

    /**
     * Ritorna una descrizione della moneta corrente.
     * 
     * @return 
     *          una descrizione della moneta corrente.
     */
    public String getDescrizione() {
        String descrizione = "moneta da " + valore.getStringaDescrittiva()
                + VALUTA;
        return descrizione;
    }
}
