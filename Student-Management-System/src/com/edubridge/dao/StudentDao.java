package com.edubridge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.edubridge.database.CP;
import com.edubridge.pojo.Student;

public class StudentDao {
	public static boolean insertStudentData(Student s) {
		try {
			boolean f = false;
			
			Connection conn = CP.createc();
			
			String query = "INSERT INTO student(sname, sphone, scity) VALUES(?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, s.getStudentName());
			ps.setString(2, s.getStudentPhone());
			ps.setString(3, s.getStudentCity());
			ps.executeUpdate();
			
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean updateStudentData(int val, String toUpdate, int id, Student s) {
		
		boolean f = false;
		try {
			Connection conn = CP.createc();
			if(val == 1) {
				// Update name
				String query = "UPDATE student SET sname=? WHERE sid=?;";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				
				f = true;
			}
			else if(val == 2) {
				// Update phone no
				String query = "UPDATE student SET sphone=? WHERE sid=?;";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				
				f = true;
			}
			else if(val == 3) {
				// Update city
				String query = "UPDATE student SET scity=? WHERE sid=?;";
				
				PreparedStatement ps = conn.prepareStatement(query);
				
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				
				f = true;
			}
			else {
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static boolean deleteStudentData(int id) {
		boolean f = false;
		try {
			Connection conn = CP.createc();
			
			String query = "DELETE FROM student WHERE sid=?;";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, id);
			ps.executeUpdate();
			
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static void showAllStudentData() {
		boolean f = false;
		try {
			Connection conn = CP.createc();
			
			String query = "SELECT * FROM student;";
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString(4);
				
				System.out.println("Student ID: " + id + 
						"\nStudent Name: " + name + 
						"\nStudent Phone: " + phone + 
						"\nStudent City: " + city);
			}
			
			f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
