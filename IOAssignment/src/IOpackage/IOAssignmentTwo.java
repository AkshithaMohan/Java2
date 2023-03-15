package IOpackage;
import java.io.*;
public class IOAssignmentTwo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			String s= "I am Akshitha";
			byte b[]=s.getBytes();
			FileOutputStream fs1= new FileOutputStream("C:\\Users\\Akshitha_Mohan\\Desktop\\io.txt");
		    fs1.write(b);
			fs1.close();
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
