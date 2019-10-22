public enum PuntiCardinali {
    NORD {
        @Override
        public void test() {
            System.out.println("metodo di ENUMERATIONS");
        }
    } ,
    SUD, OVEST, EST;
    public void test() {
        System.out.println("metodo dell’enum");
    }
}