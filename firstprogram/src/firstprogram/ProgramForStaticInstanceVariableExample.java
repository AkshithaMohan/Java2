package firstprogram;

public class ProgramForStaticInstanceVariableExample {
	
	// static variable
    static int a = 40;
  
    // instance variable
    int b = 50;
  
    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
        staticDisplay();
    }
  
    // Declaration of a static method.
    static void staticDisplay()
    { 
      System.out.println(a); 
    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramForStaticInstanceVariableExample obj = new ProgramForStaticInstanceVariableExample();
		obj.simpleDisplay();
		//calling static Method
		staticDisplay();
              
	}

}
