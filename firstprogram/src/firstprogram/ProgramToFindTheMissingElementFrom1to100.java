package firstprogram;

public class ProgramToFindTheMissingElementFrom1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,5,7,8,9};
		int n = a.length+1;
		int sum = (n*(n+1)/2);
          for (int i=0;i<a.length;i++)
          {
        	  sum=sum-a[i];
          }
          System.out.println("missing number is : "+sum);
	}

}
