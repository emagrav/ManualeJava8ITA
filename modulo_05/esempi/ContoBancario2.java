
public class ContoBancario2 {
    private String contoBancario = "5000000 di Euro";
    private int codice = 1234;
    private int codiceInserito;
    public void setCodiceInserito(int cod) {
        codiceInserito = cod;
    }
    public String getContoBancario(int codiceDaTestare) {
        return controllaCodice(codiceDaTestare);
    }
    private String controllaCodice(int codiceDaTestare) {
        if (codiceDaTestare == codice) {
            return contoBancario;
        }
        else {
            return "codice errato!!!";
        }
    }
}