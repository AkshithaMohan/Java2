package firstprogram;

public class ProgramToInsertAnElementAtASpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]=new int[] {1,2,4,5};
      int index = 2;
      int element = 3;
      
      for(int i=0;i<arr.length;i++)
      {
    	  arr[index]=element;
      }
      
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(arr[i]+"");
      }
      
      
	

}
}
