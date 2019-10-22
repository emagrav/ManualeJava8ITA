public class TestAnimali {
    public static void main(String[] args) {
        Animale<Erbivoro> tigre = new Carnivoro<Erbivoro>();
        Erbivoro<Erba> erbivoro = new Erbivoro<Erba>();
        tigre.mangia(erbivoro);
    }
}