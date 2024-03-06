package com.eb.main;

import java.util.Scanner;

import com.eb.dao.ProductDao;
import com.eb.pojo.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Online Shopping");

		int ch = 0;
		do {
			System.out.println("Press 1 Add Product");
			System.out.println("Press 2 Update Product");
			System.out.println("Press 3 Delete Product");
			System.out.println("Press 4 Read Product Records");
			System.out.println("Press 5 Exit");
			System.out.println("Enter choice:");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("Enter Product Name:");

				String pname = sc.next();
				System.out.println("Enter product prise:");

				int prise = sc.nextInt();
				System.out.println("Enter product quantity:");

				int qty = sc.nextInt();

				Product p1 = new Product(pname, prise, qty);

				boolean ans = ProductDao.insertProduct(p1);
				System.out.println("Data inserted Successfully");
				break;
			case 2:

				ProductDao.updateProduct();

				break;
			case 3:
				System.out.println("Enter Product Id which u want delete:");
				int id = sc.nextInt();
				ProductDao.deleteProduct(id);
				System.out.println("Product Id is deleted");
				break;
			case 4:
				ProductDao.showAllProductData();
				break;
			case 5:
				System.out.println("Bye Bye:");
				break;
			default:
				System.out.println("Wrong choice");
			}

		} while (ch != 5);
	}

}