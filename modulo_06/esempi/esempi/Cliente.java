package esempi;
public class Cliente {
    private String nome;
    private String indirizzo;
    private String numeroDiTelefono;
    public Cliente(String nome, String indirizzo, String numeroDiTelefono) {
        this.setNome(nome);
        this.setIndirizzo(indirizzo);
        this.setNumeroDiTelefono(numeroDiTelefono);
    }
    public void setNome(String n) {
        nome = n;
    }
    public void setIndirizzo(String ind) {
        indirizzo = ind;
    }
    public void setNumeroDiTelefono(String num) {
        numeroDiTelefono = num;
    }
    public String getNome() {
        return nome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }
}