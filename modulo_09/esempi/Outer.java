public class Outer {
    private String messaggio = "Nella classe ";
    private void stampaMessaggio() {
        System.out.println(messaggio + "Esterna");
    }
    /* la classe interna accede in maniera naturale ai membri
    della classe che la contiene */
    public class Inner {
        // classe interna
        public void metodo() {
            System.out.println(messaggio + "Interna");
        }
        public void chiamaMetodo() {
            stampaMessaggio();
        }

        //esempio proprietà 5
        private String stringaOuter = "JAVA";
        public void metodoOuter() {
            int intMetodo = 7;
            class Inner2 {
                public void metodoInner() {
                    System.out.println(stringaOuter + " " + (++intMetodo));
                }
            }
        }
        //. . .
    }
    //. . .
}