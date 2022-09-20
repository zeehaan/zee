package database;
import java.sql.*;
    public class GetOnlyValuesOfStudent {
        public static void main(String[] args) {
            String url="jdbc:mysql://localhost:3306/sys";
            String user="root";
            String password="sanria";
                String query = "select * from student";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url, user, password);
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        int count = resultSet.getInt(1);
                        System.out.println("Total number of users in the table : " + count);
                    }
                } catch (SQLException sqlEx) {
                    sqlEx.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } /* finally {
                    //close connection ,stmt and resultSet here
                    try { connection.close(); } catch(SQLException se) { *//*can't do anything *//* }
                    try { statement.close(); } catch(SQLException se) { *//*can't do anything *//* }
                    try { resultSet.close(); } catch(SQLException se) { *//*can't do anything *//* }
                }*/
            }
        }



