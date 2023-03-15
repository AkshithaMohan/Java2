package IOpackage;
import java.util.*;  
import java.io.*;  

public class readproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  try {
			FileReader reader=new FileReader("C:\\Users\\Akshitha_Mohan\\Desktop\\db.properties");
			 Properties p=new Properties();  
			    p.load(reader);  
			    System.out.println(p.getProperty("user"));  
			    System.out.println(p.getProperty("password")); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  

	}

}
