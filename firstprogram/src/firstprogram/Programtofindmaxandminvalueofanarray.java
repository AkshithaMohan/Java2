package firstprogram;

public class Programtofindmaxandminvalueofanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[]=new int[] {10,20,30,40,50};
		int len= arr.length;
		int min=arr[0];
		int max =arr[len-1];
		System.out.println("Minimum= "+min);
		System.out.println("Maximum= "+max);
	}

}
