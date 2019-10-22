public class AutoNoInner {
    private String statoMotore;
    private MeccanicoNoInner meccanico;

    public AutoNoInner () {
        meccanico = new MeccanicoNoInner(this);
    }

    public void setStatoMotore(String statoMotore) {
        this.statoMotore = statoMotore;
    }

    public String getStatoMotore() {
        return statoMotore;
    }
}