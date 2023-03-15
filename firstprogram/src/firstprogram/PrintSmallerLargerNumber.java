package firstprogram;

public class PrintSmallerLargerNumber {
	
	public static void main(String[] args) {
		
		//Method 1 -> to find largest of two numbers using class Math
		//float num1 = 4.25f;
		//int num2 =5;
		//System.out.println("The largest number of the two numbers is " + Math.max(num1,num2));
		//System.out.println("The smallest number of the two numbers is " + Math.min(num1,num2));
	
		//Method2 to find largest number in array
		int numbers[]= new int[] {55,32,45,98,82,11,9,39,50};
		//Assign first element in array to smallest and largest number
		int small = numbers[0];
		int large = numbers[0];
		for(int i=1;i<=numbers.length;i++)
		{
			if (numbers[i]>large)
			{
				large = numbers[i];
				System.out.println(large);
			}
			else if (numbers[i]<small)
			{
				small=numbers[i];
				System.out.println(small);
			}
		}
		
		
	}

}
