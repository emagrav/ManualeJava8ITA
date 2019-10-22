public class MeccanicoNoInner {
    private AutoNoInner auto;
    public MeccanicoNoInner (AutoNoInner auto){
        this.auto = auto;
    }
    public void aggiustaMotore() {
        auto.setStatoMotore ("buono");
    }
}