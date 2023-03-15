package ExceptionPackage;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		try
		{
			result=10/0;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("always executed");
		}
	

	}

}
