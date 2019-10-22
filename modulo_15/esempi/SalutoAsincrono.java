import java.util.function.*;
public class SalutoAsincrono extends Saluto {
    @Override
    public void saluta() {
        new Thread(super::saluta).start();
//        Consumer <Double> c = System.out.println(Math::random);
        Supplier<Chitarra> chitarraSupplier = Chitarra::new;
        Chitarrista chitarrista = new Chitarrista();
chitarrista.suonaChitarra(Chitarra::new);

    }
    public static void main(String args[]) {
        new SalutoAsincrono().saluta();
    }
}