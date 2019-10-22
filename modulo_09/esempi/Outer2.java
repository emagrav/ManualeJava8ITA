public class Outer2 {
    private String stringa = "esterna";
    public class Inner2 {
        private String stringa = "interna";
        public void metodoInner() {
            System.out.println(Outer2.this.stringa +
            " " + this.stringa);
        }
    }
    public static void main(String [] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner2 inner = outer.new Inner2();
        inner.metodoInner();
    }
}