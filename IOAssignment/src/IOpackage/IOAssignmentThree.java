package IOpackage;

import java.io.*;
import java.io.BufferedInputStream;

public class IOAssignmentThree {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			int i;
			String s = "I am Akshitha";
			FileInputStream fin=new FileInputStream("C:\\Users\\Akshitha_Mohan\\Desktop\\text.txt");
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Akshitha_Mohan\\Desktop\\io.txt");
			@SuppressWarnings("resource")
			BufferedInputStream b= new BufferedInputStream(fin);
			BufferedOutputStream b1 = new BufferedOutputStream(fout);
			
			
			while ((i=b.read())!=-1)
			{
				System.out.println((char)i);
			}
			
			byte[] array = s.getBytes();
			b1.write(array);
			b1.close();
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
