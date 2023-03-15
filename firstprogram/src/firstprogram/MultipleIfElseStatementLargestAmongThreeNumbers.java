package firstprogram;

public class MultipleIfElseStatementLargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10,num2=20,num3=30;
		if (num1>num2 && num1>num3)
		{
		    System.out.println(num1+" is largest");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" is largest");
		}
		else
		{
			System.out.println(num3+" is largest");
		}

	}

}
