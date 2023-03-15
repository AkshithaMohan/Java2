package firstprogram;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1 = "Java is a programming Language";
         String s2 = "Java is a programming";
         String s3 = "Java is a ";
         String s4 = " Java is ";
         String s5 = "Java";
         String s6 = "Java";
         System.out.println(s1.equalsIgnoreCase(s2));
         System.out.println(s1.startsWith("J"));
         System.out.println(s1.endsWith("e"));
         System.out.println(s5.startsWith("Java"));
         System.out.println(s5.endsWith("Java"));
         System.out.println(s5.compareTo(s6));
         System.out.println(s1.compareTo(s6));
         System.out.println(s6.compareTo(s1));
         System.out.println(s1.toUpperCase());
         System.out.println(s1.toLowerCase());
         System.out.println(s4.trim());
         System.out.println(s4.replace("a", "e"));
         String str = "geekss@for@geekss";
         String[] arrOfStr = str.split("@", 2);
         for (String a : arrOfStr)
             System.out.println(a);
         int num= 12;
         String s7 = String.valueOf(num);
         System.out.println(s7);
         int num1= 10;
         String s8= Integer.toString(num1);
         System.out.println("is a string : "+s8);
         
         
         
         
         
   
         
         
         
         
         
         
         
	}

}
