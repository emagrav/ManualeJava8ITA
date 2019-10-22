
public class IncapsulamentoStatico {
    private static int attributoStatico = 0;
    public static void setAttributoStatico(int attributoStatico) {
        IncapsulamentoStatico.attributoStatico = attributoStatico;
    }
    public static int getAttributoStatico() {
        return attributoStatico;
    }
}