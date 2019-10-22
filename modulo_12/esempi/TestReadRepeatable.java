import java.lang.reflect.*;
import java.lang.annotation.*;
import java.util.*;

public class TestReadRepeatable {
    public static void main(String args[]) {
        Class<TestRepeatable> testRepeatableClass =  TestRepeatable.class;
        TestTriggers [] annotations = testRepeatableClass.getAnnotationsByType(TestTriggers.class);
        for (TestTriggers testTriggers: annotations) {
            TestTrigger[] values = testTriggers.value();
            for(TestTrigger testTrigger: values) {
                String quando = testTrigger.quando();
                TestTrigger.StrumentoDiTest come = testTrigger.come();
                System.out.println(quando);
                System.out.println(come);
                interpretaQuando(quando);
                interpretaCome(come);
            }
        }
    }

    public static void interpretaQuando(String quando) {
        StringTokenizer st = new StringTokenizer(quando);
        if (Objects.nonNull(st)) {
            // codice complesso che interpreta la stringa
            // e programma l'esecuzione del test
        }
        //. . . 
    }

    public static void interpretaCome(TestTrigger.StrumentoDiTest come) {
        // codice complesso che registra lo strument 
        // di test per questo caso
    }
}