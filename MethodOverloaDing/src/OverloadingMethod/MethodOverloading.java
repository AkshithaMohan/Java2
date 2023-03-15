package OverloadingMethod;

public class MethodOverloading {
	int ax;
	int bx;
	void A(int a)
	{
		ax=a;
		System.out.println(ax);
	}
	void A(int a, int b)
	{
		ax = a;
		bx =b;
		System.out.println(ax);
		System.out.println(bx);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverloading MO = new MethodOverloading();
		MO.A(10);
		MO.A(20,30);
		


		
	}

}
