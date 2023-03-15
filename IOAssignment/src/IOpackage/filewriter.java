package IOpackage;
import java.io.*;

public class filewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		try
		{
		FileWriter f = new FileWriter("C:\\Users\\Akshitha_Mohan\\Desktop\\io.txt");
		f.write("\"Welcome to javaTpoint.\"");
		f.close();
		}
		catch(Exception e)
		{
		      System.out.println("success");
		}
	}

}
