import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection createDBConnection() throws SQLException, ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/sys";
        String user="root";
        String password="sanria";
        Connection con= DriverManager.getConnection(url,user,password);
        Class.forName("com.mysql.jdbc.Driver");
        return con;
    }

}
