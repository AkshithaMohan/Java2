package ThisAndSuper;

public class ThisAndSuper {
	// TODO Auto-generated method stub
			// instance variable
		    int a = 10;
		 
		    // static variable
		    static int b = 20;
		    void GFG()
		    {
		        this.a = 100;
		 
		        System.out.println(a);
		 
		        
		        this.b = 600;
		 
		        System.out.println(b);
		    }

	public static void main(String[] args) 
	{
		new ThisAndSuper().GFG();

	}

}
