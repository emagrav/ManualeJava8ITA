public class TestContenitoreGenerics {
    public static void main(String args[]) {
        ContenitoreGenerics<String> contenitore = new ContenitoreGenerics<>();
        contenitore.setObject("Stringa");
        String object = contenitore.getObject();
        System.out.println(object);
    }
}