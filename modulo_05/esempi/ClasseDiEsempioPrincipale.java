
public class ClasseDiEsempioPrincipale {
    public static void main (String args[]) {
        System.out.println("a = "+ ClasseDiEsempio.a);
        ClasseDiEsempio ogg1 = new ClasseDiEsempio();
        ClasseDiEsempio ogg2 = new ClasseDiEsempio();
        ogg1.a = 10;
        System.out.println("ogg1.a = "+ ogg1.a);
        System.out.println("ogg2.a = "+ ogg2.a);
        ogg2.a=20;
        System.out.println("ogg1.a = "+ ogg1.a);
        System.out.println("ogg2.a = "+ ogg2.a);
    }
}