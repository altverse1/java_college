//15. Write a Java Program that prints the meta data of a given table/

import java.sql.*;
import java.util.*;

public class P15_SQLjdbc {
    public static void main(String[] args) {
        Connection cn;
        Statement st;
        ResultSet rs, rs1;
        ResultSetMetaData rsmd;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("======HelloThere======");
            System.out.println("Enter DB name: ");
            String dbname = sc.nextLine();
            System.out.println("Enter ppswd: ");
            String passwd = sc.nextLine();
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbname, "root", passwd);
            st = cn.createStatement();
            DatabaseMetaData dm = cn.getMetaData();
            rs = dm.getTables(cn.getCatalog(), "%", "%", null);
            String sql = "select * from ";
            String sql1 = "";
            System.out.println("Database is: " + dbname);
            System.out.println("-------------------");
            System.out.println("Tables are: ");
            System.out.println("-------------------");
            while (rs.next()) {
                sql1 = "";
                System.out.println("=======Table name: " + rs.getString(3) + "=======");
                sql1 = sql + rs.getString(3);
                rs1 = st.executeQuery(sql1);
                rsmd = rs1.getMetaData();
                System.out.println("Columns are: ");
                System.out.println("ColumnName\tColumnType\tSize");
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    System.out.println(
                            rsmd.getColumnName(i) + "\t" + rsmd.getColumnType(i) + "\t" + rsmd.getColumnDisplaySize(i));
                }

            }
            rs.close();
            cn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
