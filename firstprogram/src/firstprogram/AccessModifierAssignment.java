package firstprogram;



public class AccessModifierAssignment {
	private int i= 10;
	private void vehicle()
	{
		System.out.println("Car is a vehicle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierAssignment obj = new AccessModifierAssignment();
		obj.vehicle();
		System.out.println(obj.i);
		

		
	}
	class subclass extends AccessModifierAssignment
	{
		int i=20;
		void vehicle()
		{
			System.out.println("Hi from Subclass");
		}
	}

}
