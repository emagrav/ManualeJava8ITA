public class SwitchStagioneMix {
    public static void main(String args[]) {
        int mese = 1;
        String stagione;
        switch (mese) {
            default: //la clausola default è opzionale
              stagione ="non identificabile";
              break;
            case 12:
            case 1:
            case 2:
            stagione ="inverno";
            break;
            case 3:
            case 4:
            case 5:
            stagione ="primavera";
        break; //senza questo break si ha estate
            case 6:
            case 7:
            case 8:
            stagione ="estate";
            break;
            case 9:
            case 10:
            case 11:
            stagione ="autunno";
            break;

        }
        System.out.println("La stagione e' "+ stagione);
    }
}