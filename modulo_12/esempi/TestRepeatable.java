@TestTrigger(quando="Ogni giorno, ore 18", come =TestTrigger.StrumentoDiTest.JUNIT)
@TestTrigger(quando="Ogni venerd�, ore 9", come =TestTrigger.StrumentoDiTest.GUI)
public class TestRepeatable {
    public void metodo(String... args) {
        // . . .
    }
}