package firstprogram;

public class FunctionToFindAvgOfArrayNumbers {
	
	static int arr[]= {10,20,30,40};
	
	static int Average()
	{
		int average=0,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		average=sum/2;
		return average;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Average is "+Average());

	}

}
