package database;

import java.sql.*;

public class GetGuidfromfilecsv {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String password = "sanria";
        String query = "select standard,site,size,qty,length,mainpart from filecsv where sno=378";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String standard = rs.getString("standard");
        String site = rs.getString("site");
        String size = rs.getString("size");
        String qty = rs.getString("qty");
        String length = rs.getString("length");
        String mainpart = rs.getString("mainpart");

        System.out.println("The Standard ,Name,Site,Size,Qty,Length,Mainpart :" + standard + " " + site + " " + size + " " + qty + " " + length + " " + mainpart);
        st.close();
        con.close();
    }
}
