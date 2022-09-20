package database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class readgettingguid4 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        String jdbcURL = "jdbc:mysql://localhost:3306/sys";
        String username = "root";
        String password = "sanria";
        String csvFilePath = "C:\\Users\\M Zeeshan\\Downloads\\Untitled spreadsheet - P02 - PART-LIST-WITH-ID WEIGHT (3).csv";
        int batchSize = 200;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
            String sql = "INSERT INTO havingguid4 (sno ,mark ,profile ,qty ,name, material ,modelid ,unitwgt ,assembly,mainpart ) VALUES (?, ?, ?, ?, ?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
            int count = 0;
            lineReader.readLine();
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String sno = data[0];
                String mark = data[1];
                String profile = data[2];
                String qty = data[3];
                String name = data[4];
                String material = data[5];
                String modelid = data[6];
                String unitwgt = data[7];
                String assembly = data[8];
                String mainpart = data[9];
                statement.setString(1, sno);
                statement.setString(2, mark);
                statement.setString(3, profile);
                statement.setString(4, qty);
                statement.setString(5, name);
                statement.setString(6, material);
                statement.setString(7, modelid);
                statement.setString(8, unitwgt);
                statement.setString(9, assembly);
                statement.setString(10, mainpart);
                statement.addBatch();
                if (count % batchSize == 0) {
                    statement.executeBatch();
                }
            }
            lineReader.close();
            statement.executeBatch();
            connection.commit();
            connection.close();
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (stmt != null)
                        conn.close();
                } catch (SQLException se) {}
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
        }
    }
}

