import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {
    static public Connection dbsConnect() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_ps_db","postgres","root");
    }
}
