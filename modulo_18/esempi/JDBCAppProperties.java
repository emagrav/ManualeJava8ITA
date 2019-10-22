import java.sql.*;
import java.util.*;
import java.io.*;

public class JDBCAppProperties {
    public static void main (String args[]) {
        Connection con = null;
        Statement cmd = null;
        ResultSet res  = null;
        try {
             Properties p = new Properties();
             p.load(new FileInputStream("config.properties"));
             String driver = p.getProperty("jdbcDriver");
             Class.forName(driver);
             String url = p.getProperty("jdbcUrl");
             con = DriverManager.getConnection (url/*, p.getProperty("jdbcUsername"),
                 p.getProperty("jdbcPassword")*/);
             cmd = con.createStatement ();
             String qry = "SELECT * FROM Album";
             res = cmd.executeQuery(qry);
             while (res.next()) {
                  System.out.printf("%s : %s (%s)\n", res.getString("Artista"), res.getString("Titolo"), res.getInt("Anno"));
             }
             res.close();
             cmd.close();
             con.close();
        } catch (SQLException | ClassNotFoundException | IOException e) {
             e.printStackTrace();
        } 
    }
}
