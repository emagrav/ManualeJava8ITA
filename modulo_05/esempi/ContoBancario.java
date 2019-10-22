
public class ContoBancario {
    private String contoBancario = "5000000 di Euro";
    private int codice = 1234;
    private int codiceInserito;
    public void setCodiceInserito(int cod) {
        codiceInserito = cod;
    }
    public int getCodiceInserito() {
        return codiceInserito;
    }
    public String getContoBancario() {
        if (codiceInserito == codice) {
            return contoBancario;
        }
        else {
            return "codice errato!!!";
        }
    }
 //   . . .
}