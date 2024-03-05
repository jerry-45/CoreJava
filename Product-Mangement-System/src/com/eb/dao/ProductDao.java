package com.eb.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eb.database.CP;
import com.eb.pojo.Product;

public class ProductDao {
	public static boolean insertProduct(Product p)
	{
		try {
			
			boolean f=false;
			
			Connection conn=CP.createc();
			
			String query="insert into product(pname,price,quantity)values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
		     ps.setString(1,p.getProductName());
		     ps.setInt(2, p.getProductPrice());
		     ps.setInt(3, p.getProductQuantity());
             ps.executeUpdate();
             f=true;
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	public static boolean updateProduct(int val,Product p)
	{
		boolean f=false;
		try {
			Connection conn=CP.createc();
			if(val==1) {
				//update product name
				String query="update product set pname=?where pid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, p.getProductName());
				ps.setInt(2, p.getProductId());
				ps.executeUpdate();
				f=true;
			}
			else if(val==2) {
				//update prise
				String query="update product set price=? where pid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setInt(1, p.getProductPrice());
				ps.setInt(2, p.getProductId());
				ps.executeUpdate();
				f=true;
			}
			else if(val==3) {
				//update quantity
				String query="update product set quantity=? where pid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setInt(1, p.getProductQuantity());
				ps.setInt(2, p.getProductId());
				ps.executeUpdate();
				f=true;
			}
			else {
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	public static boolean deleteProduct(int productId) {
		boolean f=false;
		try {
			
			Connection conn=CP.createc();
			String query="delete from product where pid=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1,productId);
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public static void showAllProductData() {
		
		boolean f=false;
		try {
			Connection conn=CP.createc();
			
			String query="select * from product";
			
			Statement st=conn.createStatement();
			
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String pname=rs.getString(2);
				int prise=rs.getInt(3);
				int quantity=rs.getInt(4);
			System.out.println("Ptudent Id:"+id+
					"\nProduct Name:"+pname+
					"\nProduct prise:"+prise+"\nProduct quantity:"+quantity);
			
			
			}
			
		}
	
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}