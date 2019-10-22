import java.sql.*;
interface MyQueries extends BaseQuery {
    @Select(sql = "select nome, cognome, indirizzo from persona")
    DataSet<Persona> getPersone ();
    @Update(sql = "delete from persona")
    int cancellaPersone();
}