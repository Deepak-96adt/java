import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/jdbc_ps_db";
        String username = "postgres";
        String password = "root";
        Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select name from register where id=2");
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
        con.close();
    }

}