package database;
import java.sql.*;
import java.util.*;
public class gettingguiddetails4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try{
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter your guid values");
//            String str2= sc.next();
//            String str="'"+str2+"'";
            String url = "jdbc:mysql://localhost:3306/sys";
            String user = "root";
            String password = "sanria";
//            String query = "select /*sno,mark,profile,qty,name,material,modelid,unitwgt,assembly,mainpart*/  * from havingguid4 where mainpart="+str;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select distinct mark from havingguid4");
            boolean flag=true;
            while(rs.next() && flag) {
                String sno = rs.getString("sno");
                String mark = rs.getString("mark");
                String profile = rs.getString("profile");
                String qty = rs.getString("qty");
                String name = rs.getString("name");
                String material = rs.getString("material");
                String modelid = rs.getString("modelid");
                String unitwgt = rs.getString("unitwgt");
                String assembly = rs.getString("assembly");
                System.out.println("The sno,mark,profile,qty,name,material,modelid,unitwgt,assembly :" + sno + " " + mark + " " + profile + " " + qty + " " + name + " " + material + " " + modelid + " " + unitwgt + " " + assembly);
                if(rs.wasNull()){
                    flag=false;
                }
            }
            st.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } catch (Throwable e1) {
            throw new RuntimeException(e1);
        }
    }
}
