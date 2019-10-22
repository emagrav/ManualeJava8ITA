
public class FileSorgente extends File {

    private String contenuto;

    public FileSorgente(String nome, int tipo) {
        super(nome, tipo);
    }

    public FileSorgente(String nome, int tipo, String contenuto) {
        this(nome, tipo);
        this.contenuto = contenuto;
    }

    public void aggiungiTesto(String testo) throws RuntimeException {
        if (contenuto == null) {
            contenuto = "";
        }
        if (testo == null) {
            throw new RuntimeException("testo = null");
        }
        contenuto += testo;
    }

    public void aggiungiTesto(String testo, int posizione) {
        try {
            if (testo != null) {
                contenuto = contenuto.substring(0, posizione) + testo + contenuto.substring(posizione);
            }
        } catch (NullPointerException exc) {
            System.out.println("Il contenuto è null : " + exc.getMessage());
            contenuto = "" + testo;
        } catch (StringIndexOutOfBoundsException exc) {
            System.out.println("L'indice " + posizione + " è invalido : " + exc.getMessage());
            contenuto = (posizione < 0 ? testo + contenuto : contenuto + testo);
        }
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

}
