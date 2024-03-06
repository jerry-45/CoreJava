package com.eb.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eb.database.CP;
import com.eb.pojo.Product;

public class ProductDao {
	public static boolean insertProduct(Product p) {
		try {

			boolean f = false;

			Connection conn = CP.createc();

			String query = "insert into product(pname,price,quantity)values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, p.getProductName());
			ps.setInt(2, p.getProductPrice());
			ps.setInt(3, p.getProductQuantity());
			ps.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	public static boolean updateProduct() {
		try {
			boolean f = false;

			Connection conn = CP.createc();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter product id for update:");

			int id = sc.nextInt();
			System.out.println("Enter product name for update:");

			String name = sc.next();

			System.out.println("Enter product prise for update:");

			int prise = sc.nextInt();

			System.out.println("Enter product quantity for update:");

			int qty = sc.nextInt();

			String query = "update product set pname='" + name + "',price='" + prise + "',quantity='" + qty
					+ "'where pid=" + id;
			PreparedStatement ps = conn.prepareStatement(query);

			ps.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean deleteProduct(int productId) {
		boolean f = false;
		try {

			Connection conn = CP.createc();
			String query = "delete from product where pid=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, productId);
			ps.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public static void showAllProductData() {

		boolean f = false;
		try {
			Connection conn = CP.createc();

			String query = "select * from product";

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				String pname = rs.getString(2);
				int prise = rs.getInt(3);
				int quantity = rs.getInt(4);
				System.out.println("Ptudent Id:" + id + "\nProduct Name:" + pname + "\nProduct prise:" + prise
						+ "\nProduct quantity:" + quantity);

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}