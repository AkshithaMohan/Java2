package hashmappackage;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class hashmapclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes"); //trying duplicate key  
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue()); 
		    try
		    {
		    map.remove(1);  
		    System.out.println("Updated list of elements: "+map); 
		    map.put(5,"watermelon");
		    System.out.println("Updated list of elements 2nd: "+map); 
		    }
		    catch(Exception ex)
		    {
		    	System.out.println("ex "+ ex); 
		    }
		   }
	}

}
