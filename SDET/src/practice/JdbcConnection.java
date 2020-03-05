package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnection {

	/*
	 * 1) Create a Connection
	 * 2) Create a query/statement
	 * 3) Execute query/statement
	 * 4) Close Connection
	 */
	
	private static String url ="jdbc:mysql://localhost:3306/kranthi";
	private static String username="root";
	private static String pwd="abc@1234";
	
	public static void main(String[] args) throws SQLException, Exception {

		//Create Connection
	
		Connection con = DriverManager.getConnection(url,username,pwd);
		
		// Create a query statement
		
		Statement stmt = con.createStatement();
		String s = "insert into student values(3,'AK','UK')";

		
		
		// Execute query/Statement
		stmt.executeQuery(s);
		
		//Close Connection
		con.close();
	}

}
