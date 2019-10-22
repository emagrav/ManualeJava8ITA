public class MeccanicoNoInner {
    private AutoInner auto;
    public MeccanicoNoInner (AutoNoInner auto){
        this.auto = auto;
    }
    public void aggiustaMotore() {
        auto.setStatoMotore ("buono");
    }
}