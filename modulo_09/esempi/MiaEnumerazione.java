public enum MiaEnumerazione {
    UNO(1), DUE(2), TRE(3);
    private int valore;
    MiaEnumerazione(int valore) {
        setValore(valore);
    }
    public void setValore(int valore) {
        this.valore = valore;
    }
    public int getValore() {
        return this.valore;
    }
    public String toString() {
        return ""+valore;
    }
}