public class Aritmetica {
    public int somma(int a, int b) {
        return a + b;
    }
    public float somma(int a, float b) {
        return a + b;
    }
    public float somma(float a, int b) {
        return a + b;
    }
    public int somma(int a, int b, int c) {
        return a + b + c;
    }
    public double somma(int a, double b, int c) {
        return a + b + c;
    }
    //esempio Varargs
    public double somma(double... doubles) {
        double risultato = 0.0D;
        for (double tmp : doubles) {
            risultato += tmp;
        }
        return risultato;
    }
}