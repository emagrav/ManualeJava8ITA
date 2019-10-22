package esempi;
public class Persona {
    private String nome, cognome;

    public Persona(String nome) {
        super();
        this.setNome(nome);
    }
    public Persona(String nome, String cognome) {
        this(nome); //chiamata al primo costruttore
        this.setCognome(cognome);
    }
    public String toString() {
        return nome + " " + cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }
}