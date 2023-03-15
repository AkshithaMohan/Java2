package Abstraction;
abstract class Dog
{
	String breed;
	public void bark()
	{
			System.out.println("Bark!");
	}
	public abstract void poop();
}
class chihuahua extends Dog{

	@Override
	public void poop() {
		// TODO Auto-generated method stub
		System.out.println("Dog Pooped!");
		
	}}

public class AbstractAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chihuahua ch= new chihuahua();
		ch.bark();
		ch.poop();
		System.out.println(ch.breed);
				

	}

}
