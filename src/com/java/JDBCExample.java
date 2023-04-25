package com.java;
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws Exception {
        // 1. Connect
        String url = "jdbc:mysql://localhost:3306/myschool";
        String username = "root";
        String password = "12346789";

        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);


        // 2. Query
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employees;");


        ResultSetMetaData rsmd = rs.getMetaData();
        rsmd.getColumnName(1);
        rsmd.getColumnLabel(1);

        // 3. Print Result
        while (rs.next()) {
           for (int i = 1; i <= rsmd.getColumnCount(); i++) {
               System.out.println(rs.getString(i) + "\t");
           }
            System.out.println();
        }
        // 4. Close
        con.close();
    }
}
