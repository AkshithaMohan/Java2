package firstprogram;

public class PrintLargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=10, num2 = 20,num3=30;
        if (num1>num2 && num1>num3)
        {
        	System.out.println("Num1="+num1 +"is the largest number");
        }
        else if(num2>num1 && num2>num3)
        {
              
         System.out.println("Num2="+num2 +"is the largest number");
         
        }
        else
        {
        	System.out.println("Num3="+num3 +"is the largest number");
        }
	}

}
