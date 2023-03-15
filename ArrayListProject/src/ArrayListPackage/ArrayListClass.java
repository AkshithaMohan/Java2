package ArrayListPackage;
import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList<String> a = new ArrayList<String>();
          a.add("A");
          a.add("B");
          a.add("C");
          a.add("D");
          a.add("E");
          a.add("F");
          a.add("G");
          a.add("H");
          a.add("I");
          a.add("J");
          a.add("K");
          a.set(4, "mango");
          a.remove(5);
          System.out.println(a);
          Iterator itr = a.iterator();
          System.out.println("first element :"+ a.get(1));
          
          while(itr.hasNext())
          {
        	  System.out.println(itr.next());
          }
          for(String b:a)
          {
        	  System.out.println(b);
          }
	}

}
