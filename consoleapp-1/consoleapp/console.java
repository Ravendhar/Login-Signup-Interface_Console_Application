package consoleapp;

//import java.sql.*;
//import java.util.*;
import java.util.Scanner;

public class console {

	
	
	public static void main(String[] args) {
		
		System.out.println("Home Page");
		System.out.println("Enter 1 for login or 2 for signup");
		Scanner sc = new Scanner(System.in); 
		Short input = sc.nextShort();	
		
		
		if(input==1) {
			try {
				HomePage.login();
			}catch (Exception e) {
				System.out.println("exception @ console/login: "+e);
			}
		}
			
		else if(input==2) {
			try {
				HomePage.signup();
			} catch (Exception e) {
				System.out.println("exception @ console/signup: "+e);  
			}
		}
		
	}
	

}
