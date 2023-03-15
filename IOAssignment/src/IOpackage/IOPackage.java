package IOpackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;  

public class IOPackage {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Akshitha_Mohan\\Desktop\\io.txt");
		try {
			int i;
			while((i=fs.read())!= -1)
			{
		        System.out.println((char)i);
			}
		    fs.close();
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
