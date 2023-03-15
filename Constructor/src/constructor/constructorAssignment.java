package constructor;

public class constructorAssignment {
	int a ;
	String B;
	constructorAssignment()
	{
		a=20;
		B="India";
		System.out.println(a + " " + B);
	}
	constructorAssignment(int ax)
	{
		a=ax;
		System.out.println(ax);
	}
	constructorAssignment(int ax,String bx)
	{
	    a=ax;
	    B=bx;
		System.out.println(bx);
		
	}
	public static void main(String[] args)
	{
		constructorAssignment cs= new constructorAssignment();
		constructorAssignment cs1= new constructorAssignment(40);
		constructorAssignment cs2= new constructorAssignment(30,"Akshi");
		System.out.println(cs.a);
		System.out.println(cs1.a);
		System.out.println(cs2.a);
		
		
		
		
	}

}
