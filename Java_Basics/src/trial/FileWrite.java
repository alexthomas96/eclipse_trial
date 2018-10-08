package trial;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

import com.nissan.training.corejava.serializable.Student;

class TimeClass {
	public static String time = "12:03:23";
}
class User {
	public static String getUserName() {
		return "Hello";}
}	

public class FileWrite 
{
	private static PrintStream out = null;
	private static ObjectInputStream in =null;
	
	public static void writeFile(String location, TimeClass timeStamp, User user, String action) throws FileNotFoundException, IOException
	{
		out = new PrintStream(new FileOutputStream(location));
		out.print("[" + timeStamp.time + "] : " + User.getUserName() + " performed action : " + action);;
		/*out.writeObject(new Student(500, "Simon"));
		out.flush();
		out.close();
		fout.close();*/
		out.flush();
		out.close();
		out = null;
	}
	
	public static void readFile(String location) throws FileNotFoundException, IOException
	{
		in = new ObjectInputStream(new FileInputStream(location));
		/*Student s =null;
		try 
		{ 
			while(true)
			{
				s= (Student)in.readObject();
				System.out.println(s.id + " " + s.name);
		
			}
		}
		catch (EOFException e)
		{
			System.out.println("file over!");
		}*/
		in.close();
		in = null;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		FileWrite.writeFile("C:\\Users\\ndh00145\\Desktop\\bob.txt", new TimeClass(), new User(),"Building!");
	}
}
