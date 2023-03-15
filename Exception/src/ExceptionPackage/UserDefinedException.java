package ExceptionPackage;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
	}

}
}