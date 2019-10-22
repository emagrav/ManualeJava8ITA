public class CiProvoConIReference {
    public void cambiaReference(Data data) {
        data = new Data();
        // Un oggetto appena istanziato
        // ha le variabili con valori nulli
        //data.giorno=29; // data punta allo stesso indirizzo
        //data.mese=7 // della variabile dataDiNascita
    }
}