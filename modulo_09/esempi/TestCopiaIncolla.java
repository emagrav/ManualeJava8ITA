public class TestCopiaIncolla {
    public Object[] invertiArrayDiPiloti(Pilota... piloti) {
        Object[] array = null;
        if (piloti != null) {
            int length = piloti.length;
            array = new Object[length];
            for (int i = 0, j = (length-1); i < length; ++i, --j) {
                array[i] = piloti[j];
            }
        }
        return array;
    }

    public Object[] invertiArrayD\iPiloti(Pilota... piloti) {
        Object[] array = null;
        if (piloti != null) {
            int length = piloti.length;
            array = new Object[length];
            for (int i = 0, j = (length-1); i < length; ++i, --j) {
                array[i] = piloti[j];
            }
        }
        return array;
    }

    public static void main(String args[]) {
        TestCopiaIncolla tci = new TestCopiaIncolla();
        Object[] piloti = tci.invertiArrayDiPiloti(new Pilota("Andrea"), new Pilota("Simone"), new Pilota("Rosalia"));
        for (Object pilota : piloti) {
            System.out.println(pilota);
        }
    }
}