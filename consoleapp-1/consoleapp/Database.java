 package consoleapp;

//import java.util.Scanner;
import java.sql.*;

public class Database extends HomePage {
		
	public void datacomparision() throws SQLException {
		
 	String query="select * from users where username= ? and password = ? ;";
 	 
	Connection connect=DBConnection.getConnect();
     	PreparedStatement preparestatement=connect.prepareStatement(query);
     
     preparestatement.setString(1, HomePage.username);
     preparestatement.setInt(2, HomePage.password);
     
     ResultSet result= preparestatement.executeQuery();
     
    if(result.next()) {
    	System.out.println("login successfull");
    	System.out.println(" ");
    	Register.registration();
    }
    else
    {
    	System.out.println("Invalid username or password "+"\n"+"you need  to signup first");
    	
    }
     
	}
	
	
	public void datainsertion() throws SQLException {
		
		String query="INSERT into users VALUES (0 , ? , ?);";
		
		Connection connect=DBConnection.getConnect();
	    PreparedStatement preparestatement=connect.prepareStatement(query);
	    
	    preparestatement.setString(1, HomePage.username);
	    preparestatement.setInt(2, HomePage.password);
		
	    int result= preparestatement.executeUpdate();
	   
	    
	    if(result>0) {
	    	System.out.println("signup successfully");
	    	System.out.println(" ");
	    	Register.registration();
	    }
	    
	    connect.close();
	}
}
