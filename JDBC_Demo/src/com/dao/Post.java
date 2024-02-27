package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Post {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/management";
		String username = "root";
		String password = "root";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		
		Statement stmt = conn.createStatement();
		
		String query = "SELECT * FROM post;";
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			int postId = rs.getInt("pid");
			String postName = rs.getString("postname");
			String postComments = rs.getString("comments");
			
			System.out.println(postId + "\t" + postName + "\t" + postComments);
		}

	}

}
