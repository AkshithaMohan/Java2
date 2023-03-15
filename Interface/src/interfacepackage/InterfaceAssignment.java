package interfacepackage;

interface waterbottleInterface
{
	void fillbottle();
	void colorofthebottle();
	
}
interface bookInterface
{
	void readBookInterface();
}

public class InterfaceAssignment implements waterbottleInterface ,bookInterface {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		InterfaceAssignment a = new InterfaceAssignment();
		a.fillbottle();
		a.colorofthebottle();
		a.readBookInterface();
		
	}

	@Override
	public void fillbottle() {
		// TODO Auto-generated method stub
		System.out.println("water bottle is full...");
	}

	@Override
	public void colorofthebottle() {
		// TODO Auto-generated method stub
		System.out.println("pink..");
		
	}

	@Override
	public void readBookInterface() {
		// TODO Auto-generated method stub
		System.out.println("reading...");
		
	}

}
