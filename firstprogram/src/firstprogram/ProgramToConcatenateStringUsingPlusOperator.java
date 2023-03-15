package firstprogram;

public class ProgramToConcatenateStringUsingPlusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABC are starting letters";
		String str2 = new String("DEF");
		String str3 = str1+str2;
		String str4 = str3.substring(3);
		String str5 = "DEF";
		String str6 = " DEF ";
		String Str = new String("Welcome to Tutorialspoint.com");
		int Len = str3.length();
		int Index = str1.indexOf("are");
		System.out.println(str3);
		System.out.println("str3 length :" + Len);
		System.out.println("str3 substring :" + str4);
		System.out.println(Index);
		System.out.println(str5.equals(str2));
		System.out.println(str5.equalsIgnoreCase(str6));
		System.out.print("Return Value :" );
	    System.out.println(Str.matches("(.*)Tutorials(.*)"));
        System.out.print("Return Value :" );
	    System.out.println(Str.matches("Tutorials"));
        System.out.print("Return Value :" );
	    System.out.println(Str.matches("Welcome(.*)"));
		
		
		

	}

}
