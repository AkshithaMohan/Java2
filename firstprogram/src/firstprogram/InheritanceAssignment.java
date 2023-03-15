package firstprogram;

class A
{
	int i=20;
	public void method1()
	{
		System.out.println("method1");
	}
	public void method2()
	{
		System.out.println("method2");
	}
	public void vehicle()
	{
		System.out.println("Vehicle starts");
	}
}
class B extends A
{
	int j =30;
	public void method3()
	{
		System.out.println("method3");
	}
	public void method4()
	{  
		System.out.println("method4");
		
	}
	public void vehicle()
	{
		System.out.println("Vehicle is running");
	}
}
class C extends B
{
	int k=40;
	public void method5()
	{
		System.out.println("method5");
	}
	public void method6()
	{  
		System.out.println("method6");
		
	}
	public void vehicle()
	{
		System.out.println("Vehicle stops");
	}
	
}

public class InheritanceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.method1();
		obj.method2();
		obj.vehicle();
		System.out.println(obj.i);
		
		B obj2 = new B();
		obj2.method3();
		obj2.method4();
		obj2.vehicle();
		System.out.println(obj2.j);
		
		C obj3 = new C();
		obj3.method5();
		obj3.method6();
		obj3.vehicle();
		System.out.println(obj3.k);
		

	}
	
   

}




