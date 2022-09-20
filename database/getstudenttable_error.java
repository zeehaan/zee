package database;
import java.sql.*;
import java.util.Scanner;
public class getstudenttable_error {
    public static void main(String[] args) throws Throwable {
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/sys";
        String user="root";
        String password="sanria";
        String query="select * from student";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println("Enter your Integer value to be stored");
                int value = sc.nextInt();
                System.out.println("Enter their marks to be stored ");
                String str = sc.next();
                value = rs.getInt(2);
                str = rs.getString(2);
                System.out.println(rs.getInt(2) + rs.getString(2));
                st.close();
                con.close();
            }
        }
        catch (SQLException excep) {
            excep.printStackTrace();
        } catch (Exception excep) {
            excep.printStackTrace();
        }
    }
}
