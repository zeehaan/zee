package database;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class readguidfileOfhavingguid {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sys";
        String username = "root";
        String password = "sanria";
        String csvFilePath = "C:\\DummyDir\\havingguid.txt";
        int batchSize = 200;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            connection.setAutoCommit(false);
            String sql = "INSERT INTO havingguid (sno ,mark ) VALUES (?, ?, ?, ?, ?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
            String lineText = null;
            int count = 0;
            lineReader.readLine();
            while ((lineText = lineReader.readLine()) != null) {
                String[] data = lineText.split(",");
                String sno = data[0];
                String standard = data[1];
                String site = data[2];
                String size = data[3];
                String qty = data[4];
                String length = data[5];
                String mainpart = data[6];
                statement.setString(1, sno);
                statement.setString(2, standard);
                statement.setString(3, site);
                statement.setString(4, size);
                statement.setString(5, qty);
                statement.setString(6, length);
                statement.setString(7, mainpart);
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
            }
        }
    }
}
