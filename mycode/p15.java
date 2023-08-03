package sqldemo;

import java.sql.*;
import java.util.*;

public class p15 {

	public static void main(String[] args) {
		Connection cn;						//ConnectionStarter
		Statement st;						//StatementExcecution
		ResultSet r1, r2;					//Results
		ResultSetMetaData rsd;				//MetaDataFromResult
		DatabaseMetaData dm;				//OverAllMD
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Password and DB name: ");
			String pass = sc.next();
			String dbname = sc.next();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname,"root",pass);
			st = cn.createStatement();
			dm = cn.getMetaData();
			r1 = dm.getTables(cn.getCatalog(), "%", "%", null);
			
			String sql = "SELECT * FROM ";
			String sql1 = "";
			
			System.out.println("Database Name:::::::>"+dbname+"\n\n");
			System.out.println("::::TABLES::::");
			
			while(r1.next())
			{
				System.out.println("Table Name:::::::>"+r1.getString(3));
				System.out.println("ColumnName\tColumnType\tSize");
				
				sql1 = sql+r1.getString(3);
				r2 = st.executeQuery(sql1);
				rsd = r2.getMetaData();
				
				for(int i = 1; i<=rsd.getColumnCount();i++)
				{
					System.out.println(rsd.getColumnLabel(i)+"\t"+rsd.getColumnTypeName(i)+"\t"+rsd.getColumnDisplaySize(i));
				}
				System.out.println("<----------------------------------->\n");
				
			}
			
			cn.close();
			sc.close();

		} 
		catch (Exception e) 
		{
			System.out.println("Exception"+e.getMessage());
		}

	}

}
