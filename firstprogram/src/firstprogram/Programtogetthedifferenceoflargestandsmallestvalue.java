package firstprogram;

import java.util.Arrays;

public class Programtogetthedifferenceoflargestandsmallestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {20,60,14,2};
		Arrays.sort(arr);
		System.out.println("sorted array is "+ Arrays.toString(arr));
		int length=arr.length;
		int min=arr[0];
		int max= arr[length-1];
		int diff= max-min;
		System.out.println("Difference is "+ diff);
		

	}

}
