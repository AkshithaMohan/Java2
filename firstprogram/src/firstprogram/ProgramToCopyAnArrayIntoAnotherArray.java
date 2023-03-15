package firstprogram;

public class ProgramToCopyAnArrayIntoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= new int[] {1,2,3,4,5};
		int arr2[]= new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		//To Print Original Array
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+ "");
		}
		//To Print Copied Array
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]+ "");
		}
	}

}
