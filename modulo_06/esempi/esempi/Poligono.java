package esempi;
public class Poligono {
    public int numeroLati;
    public float lunghezzaLatoUno;
    public float lunghezzaLatoDue;
    public float lunghezzaLatoTre;
    //. . . . . . . .
}
class Triangolo extends Poligono {
    public final int NUMERO_LATI = 3;
    //. . . . . . . .
}
class Rettangolo extends Poligono {
    public final int NUMERO_LATI = 4;
    public float lunghezzaLatoQuattro;
    //. . . . . . . .
}