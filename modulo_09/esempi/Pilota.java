public class Pilota {
    private String nome;

    public Pilota (String nome) {
        this.nome = nome;
    }

    public void fattiUnGiro(Volante volante) {
        volante.decolla();
        volante.plana();
        volante.atterra();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
}