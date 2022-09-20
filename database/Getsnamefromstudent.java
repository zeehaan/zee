package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Getsnamefromstudent {
    public static void main(String[] args) throws Throwable {
        String url="jdbc:mysql://localhost:3306/sys";
        String user="root";
        String password="sanria";
        String query="select sname from student where rollno=3";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String name=rs.getString("sname");
        System.out.println("name :"+name);
        st.close();
        con.close();
    }
}
