public abstract class File {

    private String nome;

    private TipoFileSorgente tipo;

    public File(String nome, TipoFileSorgente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoFileSorgente getTipo() {
        return tipo;
    }

    public void setTipo(TipoFileSorgente tipo) {
        this.tipo = tipo;
    }
}
