package com.edubridge.creational.singletondesignpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {
	private static JDBCSingleton jdbc;
	private JDBCSingleton() {
		
	}
	
	public static JDBCSingleton getInstance() {
		if(jdbc == null) {
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}
	
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/singleton", "root", "root");
		return conn;
	}
	
	public int insert(String name, String pass, int id) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		
		int recordCounter = 0;
		
		try {
			c = this.getConnection();
			ps = c.prepareStatement("INSERT INTO employee(eid, uname, upass) VALUES(?, ?, ?);");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, pass);
			
			recordCounter = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		return recordCounter;
	}
	
	public void view() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = this.getConnection();
			ps = conn.prepareStatement("SELECT * FROM employee;");
			//ps.setString(1, name);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt(1) + "\tName: " + rs.getString(2) + "\tPassword: " + rs.getString(3));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}
	}
	
	public int update(int id, String username, String password) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		
		try {
			c = this.getConnection();
			ps = c.prepareStatement("UPDATE employee SET uname=?, upass=? WHERE eid=?;");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setInt(3, id);
			
			recordCounter = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		
		return recordCounter;
	}
	
	public int delete(int userid) throws SQLException {
		Connection c = null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		
		try {
			c = this.getConnection();
			ps = c.prepareStatement("DELETE FROM employee WHERE eid='"+userid+"';");
			recordCounter = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		return recordCounter;
	}
	
}