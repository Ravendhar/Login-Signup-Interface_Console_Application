package consoleapp;

import java.sql.SQLException;
import java.util.Scanner;

public class HomePage{
	
	public static String username;
	public static int password;
	static Scanner sc = new Scanner(System.in);
	
	public static void login() {
		 
		System.out.println("Enter UserName: ");
		username = sc.nextLine();
		
		System.out.println("Enter Password: ");   
		password = sc.nextInt();
		
		Database obj = new Database();
		try {
			obj.datacomparision();
		}catch (SQLException e) {
			System.out.println("exception @ HomePage/login"+"\n"+e);
		}
		
	}
	
	public static void signup() {
		
		System.out.println("Enter UserName: ");
		username = sc.nextLine();
		
		System.out.println("Enter Password: ");  
		password = sc.nextInt();
		
		Database obj = new Database();
		try {
			obj.datainsertion();
			
		} catch (SQLException e) {
			System.out.println("exception @ HomePage :"+e);         //Format error in username or password
		  }
		
		}
	}
	

