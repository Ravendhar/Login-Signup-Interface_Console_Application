package consoleapp;

import java.sql.*;
import java.util.Scanner;

public class Register {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void registration() throws SQLException{
		try {
				
				System.out.println("REGISTRATION DETAILS");
				
				System.out.println("Enter donor name as per aadhar:");
				String donorname = sc.nextLine();
				
				System.out.println("Enter mobilenumber :");
				Long mobilenumber = Long.parseLong(sc.nextLine());
				
				System.out.println("Enter age :");
				Short age = Short.parseShort(sc.nextLine());
				
				System.out.println("Enter bloodtype :");
				String bloodtype = sc.nextLine();
				
				
			
				
			
			String query="INSERT into donors VALUES (0 , ? , ? , ? , ?);";
			
			Connection connect=DBConnection.getConnect();
			PreparedStatement preparestatement=connect.prepareStatement(query);
			
			preparestatement.setString(1, donorname);
			preparestatement.setLong(2, mobilenumber);
			preparestatement.setShort(3, age);
			preparestatement.setString(4, bloodtype);
			
			int result = preparestatement.executeUpdate();
			
				if(result>0) {
					System.out.println("registration completed");
				}
			//connect.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

	
}
