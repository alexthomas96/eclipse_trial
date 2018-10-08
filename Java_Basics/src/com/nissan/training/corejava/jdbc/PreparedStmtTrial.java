package com.nissan.training.corejava.jdbc;

import java.sql.*;  
import java.io.*;  
public class PreparedStmtTrial
{  
	public static void main(String args[])throws Exception
	{  
		Class.forName("com.mysql.jdbc.Driver");
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nissan", "root", "admin");
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		PreparedStatement ps = con.prepareStatement("insert into student(name,age) values (?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		do
		{  
			System.out.println("Enter Name:");  
			String name=br.readLine();  
			System.out.println("Enter Age:");  
			String age=br.readLine();
  
			ps.setString(1,name);  
			ps.setString(2,age);  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
  
			System.out.println("Do you want to continue: y/n");  
			String s=br.readLine();  
			if(s.startsWith("n"))
			{  
				break;  
			}  
		}while(true);  
  
		con.close();  
	}
}  