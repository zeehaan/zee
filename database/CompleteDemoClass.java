package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
         class studentclassmethods {
            void GetAllRecords(){
                Connection connection = null;

                try {
                    connection = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/sys", "root", "sanria");
                } catch (Exception e) {

                    e.printStackTrace();
                }

                if (connection != null) {
                    System.out.println("Getting All the Records");
                } else {
                    System.out.println("Failed to make connection");
                }

                try {
                    Statement stmt = connection.createStatement();
                    String query = "select * from student ;";
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        String rollno = rs.getObject(1).toString();
                        String sname = rs.getObject(2).toString();
                        String TableContents=rollno+" "+sname;
//	            System.out.println("The role number of the student is " + rollno + " and his Name is " + sname);
                        System.out.println(TableContents);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    for(Throwable ex : e) {
                        System.err.println("Error occurred " + ex);
                    }
                    System.out.println("Error in fetching data");
                }
            }

            void GetsingleRecord() {
                System.out.println("Getting Single Record");
                String url = "jdbc:mysql://localhost:3306/sys";
                String uname = "root";
                String pass = "sanria";
                String query = "select sname from student where rollno=3";

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(url, uname, pass);
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    rs.next();
                    String name = rs.getNString("sname");
                    rs.next();
                    System.out.println("This RollNum is associated to "+name);

                    st.close();
                    con.close();
                }
                catch (SQLException e) {
                    e.printStackTrace();
                    for(Throwable ex : e) {
                        System.err.println("Error occurred " + ex);
                    }
                    System.out.println("Error in fetching data");
                } catch (ClassNotFoundException e) {

                    e.printStackTrace();
                }
            }
        }




