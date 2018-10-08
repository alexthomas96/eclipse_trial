package com.nissan.training.corejava.jdbc;
import java.util.Scanner;
import java.util.Date;
import java.sql.*;
import java.time.LocalDateTime;
public class DBDemo 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nissan", "root", "admin");
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		String ch = new String ("y");
		//while(ch.equals("y"))
		//{
			//System.out.println("Enter update query here : ");
			//String s = sc.nextLine();
			//st.executeUpdate(s);
			ResultSet rs = st.executeQuery("select * from student where id = 500");
			Date d=null;
			Timestamp tsm=null;
			rs.next();
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "  + rs.getTimestamp(4));
			tsm = rs.getTimestamp(4);
			System.out.println(tsm);
			//d = new Date(timestamp.getTime());
			LocalDateTime dt3 = tsm.toLocalDateTime();
			System.out.println(dt3);
			
			//System.out.println("Continue? : ");
			
		//}
			/*ResultSetMetaData metaData = rs.getMetaData();
		for(int i=1;i< metaData.getColumnCount();i++)
	    {
	      System.out.println(metaData.getColumnName(i)+"\t"+metaData.getColumnTypeName(i));
	    }*/
		//con.close();
	}
}
