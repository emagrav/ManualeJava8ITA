public class Persona implements java.io.Serializable{
    
    private String nome;
    private String cognome;
    private transient Thread t = new Thread();
    private transient String codiceSegreto;

    public Persona(){
    }

    public Persona(String nome, String cognome, String codiceSegreto){
        this.setNome(nome);
        this.setCognome(cognome);
        this.setCodiceSegreto(codiceSegreto);
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
    
    public void setCodiceSegreto(String codiceSegreto) {
        this.codiceSegreto = codiceSegreto;
    }

    public String getCodiceSegreto() {
        return codiceSegreto;
    }
    
    public String toString() {
        return "Nome: " + getNome() +
               "\nCognome: " + getCognome() + 
               "\nCodice Segreto: " + getCodiceSegreto();
    }

}