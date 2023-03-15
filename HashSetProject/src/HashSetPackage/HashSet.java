package HashSetPackage;
import java.io.*;
import java.util.*;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		java.util.HashSet<ArrayList> HS =new java.util.HashSet<ArrayList>();
		ArrayList list1= new ArrayList();
		ArrayList list2 = new ArrayList();
		list1.add("mango");
		list1.add("bullet");
		list2.add("ninja");
		list2.add("akshi");
		HS.add(list1);
		HS.add(list2);
		System.out.println(HS);
		
		
		
		

	}

}
