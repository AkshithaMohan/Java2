package firstprogram;

import java.util.Arrays;

public class Functiontoremoveaspecificelementfromanarray {
	
	public static int[] removetheelement(int arr[],int index)
	{
		if(arr==null || index<0 ||  index>arr.length)
		{
			return arr;
		}
		
		int[] anotherArray= new int[ arr.length-1];
		for(int i=0,k=0; i<arr.length;i++)
		{
			if (i==index)
			{
				continue;
			}
			anotherArray[k++]= arr[i];
		}
			
		return anotherArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int[] arr = {1,2,3,4,5};
		System.out.println("Original Array "+ Arrays.toString(arr));
		
		int index=2;
		System.out.println("index to be removed "+ index);
		
		arr= removetheelement(arr,index);
		System.out.println("Resultant Array "+ Arrays.toString(arr));
		
	}

}
