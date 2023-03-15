package p2;

import firstprogram.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Access3 a = new Access3();
		
		System.out.println(a.hour); // protected
		System.out.println(a.getminutes()); // protected
	}

}
