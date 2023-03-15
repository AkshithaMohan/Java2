package IOpackage;
import java.io.*;

public class IOAssignmentfivesix {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\Akshitha_Mohan\\Desktop\\text.txt");
		FileReader f= new FileReader(f1);
		try {
			int content;
			while((content= f.read())!=-1)
			{
				System.out.println((char)content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
