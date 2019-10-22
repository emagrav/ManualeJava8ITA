public class ClasseBase {
    public void metodo() throws java.io.IOException {
    }
}
class SottoClasseCorretta1 extends ClasseBase {
    public void metodo() throws java.io.IOException {
    }
}
class SottoClasseCorretta2 extends ClasseBase {
    public void metodo() throws java.io.FileNotFoundException {
    }
}
class SottoClasseCorretta3 extends ClasseBase {
    public void metodo() {
    }
}
class SottoClasseScorretta extends ClasseBase {
    public void metodo() throws java.sql.SQLException {
    }
}