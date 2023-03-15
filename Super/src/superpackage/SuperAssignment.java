package superpackage;

class Vehicle
{
	int maxspeed = 120;
	Vehicle()
	{
		System.out.println("inside parent constructor");
	}
	public void vroom()
	{
		System.out.println("Vroom,Vroom....");
	}
}
class Car extends Vehicle
{
	Car()
	{
		super();
		System.out.println("we are inside car constructor");
		
	}
	int maxspeed=300;
	Car(int maxspeed)
	{
		this.maxspeed=maxspeed;
		System.out.println("we are inside parametrized constructor");
		System.out.println(this.maxspeed);
		
	}
	void display()
	{
		System.out.println(super.maxspeed);
		super.vroom();
	}
	public void vroom()
	{
		System.out.println("SKUUUURTTT....");
		super.vroom();
	}
}

public class SuperAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println(c.maxspeed);
		c.display();
		c.vroom();

	}

}
