package com.edubridge.main;

import java.util.Scanner;

import com.edubridge.dao.StudentDao;
import com.edubridge.pojo.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Welcome to Student Management Portal " + name);
		
		int ch = 0;
		do {
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to Update Student");
			System.out.println("Press 3 to Delete Student");
			System.out.println("Press 4 to Read Student Record");
			System.out.println("Press 5 to Exit");
			System.out.println("Enter choice: ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Student Name: ");
				String sname = sc.next();
				System.out.println("Enter Student Phone No:");
				String sphone = sc.next();
				System.out.println("Enter Student City: ");
				String scity = sc.next();
				
				Student s1 = new Student(sname, sphone, scity);
				
				boolean ans = StudentDao.insertStudentData(s1);
				
				System.out.println("Data Inserted Successfully");
				
				break;
				
			case 2:
				System.out.println("Press 1 to Update Name");
				System.out.println("Press 2 to Update Phone No");
				System.out.println("Press 3 to Update City");
				
				int val = sc.nextInt();
				
				if(val == 1) {
					System.out.println("Enter name which you want to update: ");
					String sname1 = sc.next();
					
					System.out.println("Enter id: ");
					int sid = sc.nextInt();
					
					Student s2 = new Student();
					s2.setStudentName(sname1);
					boolean f = StudentDao.updateStudentData(val, sname1, sid, s2);
					
					System.out.println("Student Name Updated Successfully");
				}
				else if(val == 2){
					System.out.println("Enter phone number which you want to update: ");
					String sphone1 = sc.next();
					
					System.out.println("Enter id: ");
					int sid = sc.nextInt();
					
					Student s2 = new Student();
					s2.setStudentPhone(sphone1);
					boolean f = StudentDao.updateStudentData(val, sphone1, sid, s2);
					
					System.out.println("Student Phone Number Updated Successfully");
				}
				else if(val == 3){
					System.out.println("Enter city which you want to update: ");
					String scity1 = sc.next();
					
					System.out.println("Enter id: ");
					int sid = sc.nextInt();
					
					Student s2 = new Student();
					s2.setStudentCity(scity1);
					boolean f = StudentDao.updateStudentData(val, scity1, sid, s2);
					
					System.out.println("Student City Updated Successfully");
				}
				else {
					System.out.println("Data is not updated");
				}
				
				break;
				
			case 3:
				System.out.println("Enter ID which you want to delete");
				int id = sc.nextInt();
				
				StudentDao.deleteStudentData(id);
				
				System.out.println("ID is deleted");
				
				break;
				
			case 4:
				StudentDao.showAllStudentData();
				
				break;
				
			case 5:
				System.out.println("Bye Bye");
				break;
				
			default:
				System.out.println("You entered the invalid choice!!!");
			}
		}
		while(ch != 5);
	}
}