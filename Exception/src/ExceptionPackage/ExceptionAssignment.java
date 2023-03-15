package ExceptionPackage;
import java.math.BigDecimal;

public class ExceptionAssignment {

	public void divide(int a, int b)
	{
		try
		{
			int result=a/b;
			System.out.println("division result : "+ result);
		}
		catch(java.lang.Exception ex)
		{
			System.out.println("should avoid dividing by zero"+ ex);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionAssignment ea= new ExceptionAssignment();
		ea.divide(1, 0);
		BigDecimal bd1= new BigDecimal(11);
		BigDecimal bd2= new BigDecimal(17);
		try {
		bd1=bd1.divide(bd2);
		System.out.println(bd1.toString());
		}
		catch(java.lang.Exception e)
		{
			System.out.println("decimal exception"+e);
		}
		
		try {
		
			int a[]=new int[5];
			 int b = a[10];
			 System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Index Exception Occurs");
			
		}
		catch(Exception e)
		{
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code");
		
		 
		
		
		 
		
		
		
		

	}

}
