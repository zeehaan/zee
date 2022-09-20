package database;

import java.sql.*;
import java.util.Scanner;
import java.sql.*;
import java.util.Scanner;
public class gettinguiddetials3 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your guid values");
        String str= sc.next();
//        String str1="'+str+'";

        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String password = "sanria";
        String query = "select sno,mark,profile,qty,name,material,modelid,unitwgt,assembly,mainpart from havingguid2 where mainpart="+str;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next()) {
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

        }
        st.close();
        con.close();
    }
}
