import java.util.Objects;

public class PuntoHashCode {
    private String x, y;

    public PuntoHashCode(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public void setX(String x) {
        this.x = x;
    }
    public String getX() {
        return x;
    }
    public void setY(String y) {
        this.y = y;
    }
    public String getY() {
        return y;
    }


    @Override
    public boolean equals(Object altroOggetto) {
        if (!(altroOggetto instanceof PuntoHashCode)) {
            return false;
        }
        PuntoHashCode altroPunto = (PuntoHashCode) altroOggetto;
        return Objects.equals(this.x, altroPunto.x) && Objects.equals(this.y, altroPunto.y);
    }

    public static void main(String args[]) {
        PuntoHashCode p1 = new PuntoHashCode("5","6");
        PuntoHashCode p2 = new PuntoHashCode("1","2");
        PuntoHashCode p3 = new PuntoHashCode("2","6");
        System.out.println( p1.hashCode());
        System.out.println( p2.hashCode());
        System.out.println( p3.hashCode());
    }

/* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((x == null) ? 0 : x.hashCode());
        result = prime * result + ((y == null) ? 0 : y.hashCode());
        return result;
    }*/
    /* @Override
    public int hashCode() {
        return 31 * (Objects.hashCode(x) + Objects.hashCode(y));
    } */

    @Override
    public int hashCode() {
        return 31 * Objects.hash(x, y);
    }
}