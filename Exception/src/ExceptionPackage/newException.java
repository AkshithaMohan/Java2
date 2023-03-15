package ExceptionPackage;

public class newException {
    public void checkage(int age)
    {
    	if(age<18)
    	{
    		throw new ArithmeticException("you must be 18 years or older to vote!");
    		
    	}
    	else
    	{
    		System.out.println("Eligible to Vote");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newException ne=new newException();
        ne.checkage(5);
	}

}
