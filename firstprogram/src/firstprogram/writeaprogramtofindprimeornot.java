package firstprogram;
import java.util.Scanner;

public class writeaprogramtofindprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner s = new Scanner(System.in);
		    System.out.println("Enter The Number : ");
	        int num = s.nextInt();
	        int temp = num;
	        int rev=0,rem;
	        while(temp!=0)
	        {

	              rem=temp%10;
	              rev=rev*10+rem;
	              temp=temp/10;
	        }       
	        if( num ==rev)
	        {
	             System.out.println(num + " is a palindrome number");
	        }
	        else
	        {
	            System.out.println(num + " is not a palindrome number");
	        }

	    }		


}
