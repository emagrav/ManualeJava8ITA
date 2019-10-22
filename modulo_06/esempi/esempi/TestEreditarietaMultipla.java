package esempi;

public class TestEreditarietaMultipla {
    public static void main(String args[]) {
        ChiStaLeggendo tu = new ChiStaLeggendo();
        Libro java8 = new Libro("Manuale di Java 8","Claudio De Sio Cesari");
        tu.programma("Java");
        tu.leggi(java8);
    }
}