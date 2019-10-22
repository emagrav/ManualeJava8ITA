import java.sql.*;
public class MyQueriesTest {
    public static void main(String args[]) throws Exception{
        //. . . 
        Connection con =
        DriverManager.getConnection ("myURL", "myUserName", "myPassword");
        MyQueries mq = con.createQueryObject(MyQueries.class);
        DataSet<Persona> rows = mq.getPersone();
        for (Persona persona: rows) {
            System.out.println("Nome = " + persona.nome);
            System.out.println("Nome = " + persona.cognome);
            System.out.println("Indirizzo = " + persona.indirizzo);
        }

        for (Persona persona: rows) {
            if (persona.nome.equals("Giorgio")) {
                rows.delete();
            } else if (persona.cognome.equals("De Sio")) {
                persona.cognome = "De Sio Cesari";
                rows.modify();
            }
        }
        Persona persona = new Persona();
        persona.nome = "Andrea";
        persona.cognome = "De Sio Cesari";
        rows.insert(persona);
    }
}