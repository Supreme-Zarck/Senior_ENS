package DAO;

import java.sql.*;

public class MysqlConnection {
	 Connection conn;
	 Statement stmt;
	 
	 
	public MysqlConnection() {
		super();
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "");
		      stmt = conn.createStatement();
		      
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Statement getStmt() {
		return stmt;
	}
	
	
	

}
