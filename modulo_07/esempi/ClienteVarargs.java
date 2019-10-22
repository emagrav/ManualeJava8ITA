public class ClienteVarargs {
    private String nome;
    private String indirizzo;
    private String numeroDiTelefono;

    public ClienteVarargs(String... par) {
        if (par != null) {
            if (par[0] != null) {
                this.nome = par[0];
            }
            if (par[1] != null) {
                this.indirizzo = par[1];
            } if (par[2] != null) {
                this.numeroDiTelefono = par[2];
            }
        }
    }
//    . . .
} 
