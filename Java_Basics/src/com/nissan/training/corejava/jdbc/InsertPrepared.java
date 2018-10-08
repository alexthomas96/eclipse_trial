package com.nissan.training.corejava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import com.mysql.jdbc.PreparedStatement;

public class InsertPrepared
{
	public static void main(String[] args) 
	{	 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nissan", "root", "admin");
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			PreparedStatement stmt = con.prepareStatement("insert into student(name,age) values (?,?)");
			stmt.setString(1, "Timothy"); //first parameter in the query
			stmt.setString(2, "54");
			int i= stmt.executeUpdate();
			System.out.println(i+ " record(s) inserted");
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
