public class FabbricaChitarraFender  implements FabbricaChitarra {
    public Chitarra getChitarra(){
        return new Chitarra("Fender");
    }
}