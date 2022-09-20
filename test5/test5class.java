//package test5;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.sql.*;
//
//public class test5class {
//
//    public void readthecsvfile_sql(){
//                String jdbcURL = "jdbc:mysql://localhost:3306/sys";
//                String username = "root";
//                String password = "sanria";
//                String csvFilePath ="C:\\Users\\M Zeeshan\\Downloads\\Untitled spreadsheet - tobequeried (1).csv";
//                int batchSize = 200;
//                Connection connection = null;
//                try {
//                    connection = DriverManager.getConnection(jdbcURL, username, password);
//                    connection.setAutoCommit(false);
//                    String sql = "INSERT INTO readcsv_sql1(sno,modelid,mark,name,profile,location,startel,endel,weight ) VALUES (?, ?, ?, ?, ? ,? ,? ,? ,?)";
//                    PreparedStatement statement = connection.prepareStatement(sql);
//                    BufferedReader lineReader = new BufferedReader(new FileReader(csvFilePath));
//                    String lineText = null;
//                    int count = 0;
//                    lineReader.readLine();
//                    while ((lineText = lineReader.readLine()) != null) {
//                        String[] data = lineText.split(",");
//                        String sno = data[0];
//                        String modelid = data[1];
//                        String mark = data[2];
//                        String name = data[3];
//                        String profile = data[4];
//                        String location = data[5];
//                        String startel = data[6];
//                        String endel = data[7];
//                        String weight = data[8];
//                        statement.setString(1, sno);
//                        statement.setString(2, modelid);
//                        statement.setString(3, mark);
//                        statement.setString(4, name);
//                        statement.setString(5, profile);
//                        statement.setString(6, location);
//                        statement.setString(7, startel);
//                        statement.setString(8, endel);
//                        statement.setString(9, weight);
//                        statement.addBatch();
//                        if (count % batchSize == 0) {
//                            statement.executeBatch();
//                        }
//                    }
//                    lineReader.close();
//                    statement.executeBatch();
//                    connection.commit();
//                    connection.close();
//                } catch (IOException ex) {
//                    System.err.println(ex);
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                    try {
//                        connection.rollback();
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//    @GetMapping(path = "/hello-world/path-varaible/{name}")
//    public HelloWorldBean helloWorldBean(@PathVariable String name) {
//        return new HelloWorldBean (String.format("Hello World,%s",name));
//    }
//             public void getuniquelLPN( String query){
//                try{
//                    String url = "jdbc:mysql://localhost:3306/sys";
//                    String user = "root";
//                    String password = "sanria";
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    Connection con = DriverManager.getConnection(url, user, password);
//                    Statement st = con.createStatement();
//                    ResultSet rs = st.executeQuery(query);
//                    boolean flag=true;
//                    while(rs.next() && flag) {
//                        String sno = rs.getString("sno");
//                        String modelid = rs.getString("modelid");
//                        String mark = rs.getString("mark");
//                        String name = rs.getString("name");
//                        String profile = rs.getString("profile");
//                        String location = rs.getString("location");
//                        String startel = rs.getString("startel");
//                        String endel = rs.getString("endel");
//                        String weight = rs.getString("weight");
//                        System.out.println("location "+" "+location+"sno :"+" "+sno+"model id "+" "+modelid+"mark "+" "+mark+"name"+" "+name+"profile "+" "+profile+"startel "+" "+startel+"endel "+" "+endel+"weight "+" "+weight );
//                        if(rs.wasNull()){
//                            flag=false;
//                        }
//                    }
//                    st.close();
//                    con.close();
//                } catch (ClassNotFoundException | SQLException e) {
//                    throw new RuntimeException(e);
//                } catch (Throwable e1) {
//                    throw new RuntimeException(e1);
//                }
//            }
//
//            public void getmaxavg(String query){ try{
//                String url = "jdbc:mysql://localhost:3306/sys";
//                String user = "root";
//                String password = "sanria";
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection con = DriverManager.getConnection(url, user, password);
//                Statement st = con.createStatement();
//                ResultSet rs = st.executeQuery(query);
//                boolean flag=true;
//                while(rs.next() && flag) {
//                    String profile=rs.getString("profile");
//                    String sum = rs.getString("sum(weight)");
//                    String avg = rs.getString("avg(weight)");
//
//                    System.out.println(" profile : "+profile+ "  "+"Max Weight :"+sum+"                     "+"Avg Weight :"+avg);
//                    if(rs.wasNull()){
//                        flag=false;
//                    }
//                }
//                st.close();
//                con.close();
//            } catch (ClassNotFoundException | SQLException e) {
//                throw new RuntimeException(e);
//            } catch (Throwable e1) {
//                throw new RuntimeException(e1);
//            }
//            }
//            public void getmarkunique(String query){
//                try{
//                    String url = "jdbc:mysql://localhost:3306/sys";
//                    String user = "root";
//                    String password = "sanria";
//                    Class.forName("com.mysql.cj.jdbc.Driver");
//                    Connection con = DriverManager.getConnection(url, user, password);
//                    Statement st = con.createStatement();
//                    ResultSet rs = st.executeQuery(query);
//                    boolean flag=true;
//                    while(rs.next() && flag) {
//                        String mark = rs.getString("mark");
//                        System.out.println("mark :"+mark);
//                        if(rs.wasNull()){
//                            flag=false;
//                        }
//                    }
//                    st.close();
//                    con.close();
//                } catch (ClassNotFoundException | SQLException e) {
//                    throw new RuntimeException(e);
//                } catch (Throwable e1) {
//                    throw new RuntimeException(e1);
//                }
//            }
//
//
//}
//
////          public void getuniquelprofile( String query){
////        try{
////            String url = "jdbc:mysql://localhost:3306/sys";
////            String user = "root";
////            String password = "sanria";
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            Connection con = DriverManager.getConnection(url, user, password);
////            Statement st = con.createStatement();
////            ResultSet rs = st.executeQuery(query);
////            boolean flag=true;
////            while(rs.next() && flag) {
////                String sno = rs.getString("sno");
////                String modelid = rs.getString("modelid");
////                String mark = rs.getString("mark");
////                String name = rs.getString("name");
////                String profile = rs.getString("profile");
////                String location = rs.getString("location");
////                String startel = rs.getString("startel");
////                String endel = rs.getString("endel");
////                String weight = rs.getString("weight");
////                System.out.println("profile "+" "+profile+"sno :"+" "+sno+"model id "+" "+modelid+"mark "+" "+mark+"name"+" "+name+"location "+" "+location+"startel "+" "+startel+"endel "+" "+endel+"weight "+" "+weight );
////                if(rs.wasNull()){
////                    flag=false;
////                }
////            }
////            st.close();
////            con.close();
////        } catch (ClassNotFoundException | SQLException e) {
////            throw new RuntimeException(e);
////        } catch (Throwable e1) {
////            throw new RuntimeException(e1);
////        }
////    }
////           public void getuniquelname( String query){
////        try{
////            String url = "jdbc:mysql://localhost:3306/sys";
////            String user = "root";
////            String password = "sanria";
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            Connection con = DriverManager.getConnection(url, user, password);
////            Statement st = con.createStatement();
////            ResultSet rs = st.executeQuery(query);
////            boolean flag=true;
////            while(rs.next() && flag) {
////                String sno = rs.getString("sno");
////                String modelid = rs.getString("modelid");
////                String mark = rs.getString("mark");
////                String name = rs.getString("name");
////                String profile = rs.getString("profile");
////                String location = rs.getString("location");
////                String startel = rs.getString("startel");
////                String endel = rs.getString("endel");
////                String weight = rs.getString("weight");
////                System.out.println("name"+" "+name+"sno :"+" "+sno+"model id "+" "+modelid+"mark "+" "+mark+"profile "+" "+profile+"location "+" "+location+"startel "+" "+startel+"endel "+" "+endel+"weight "+" "+weight );
////                if(rs.wasNull()){
////                    flag=false;
////                }
////            }
////            st.close();
////            con.close();
////        } catch (ClassNotFoundException | SQLException e) {
////            throw new RuntimeException(e);
////        } catch (Throwable e1) {
////            throw new RuntimeException(e1);
////        }
////    }
