public class Erbivoro<E extends Erba> implements Cibo, Animale<E> {
    public void mangia(E erba) {
        //un erbivoro mangia erba
    }

    public String getColore() {
        //. . .
        return null;
    }
}