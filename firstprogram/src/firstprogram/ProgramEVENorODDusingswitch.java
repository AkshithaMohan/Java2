package firstprogram;
import java.util.Scanner;

public class ProgramEVENorODDusingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number to check : ");
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		switch(num%2)
		{
		  case 0:  System.out.println(num+ " is a even number");
		  break;
		  
		  case 1:  System.out.println(num+ " is a odd number");
		  break;
		
		}
	}

}
