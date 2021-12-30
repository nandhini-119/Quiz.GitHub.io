package com.login.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao
{
	
		public boolean check(String uname,String pass)
		{ 
	                
			try {
	  			Class.forName("com.mysql.jdbc.Driver");
	  			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbuser","root","root");
	  			PreparedStatement stmt=con.prepareStatement("select *from one where uname=? and pass=?");
	  			stmt.setString(1, uname);
	  			stmt.setString(2, pass);
				ResultSet rs=stmt.executeQuery();
	             
	  			
				if(rs.next())
				{
	  					return true;
				}
				
			    }catch(Exception e){
	     			
			    	e.printStackTrace();
					
			    }
	            return false;
	
	}


}
