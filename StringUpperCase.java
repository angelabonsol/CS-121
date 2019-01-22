public class StringUpperCase
{
   	public static void main(String[] args)
   	{
	String convertUpper;  
   
	String title = new String("Java Software Solutions");

	System.out.println("The string is " + title);

	convertUpper = title.toUpperCase();
	System.out.println("convertUpper is " + convertUpper);

	System.out.println("The string is (still) " + title);

   	}
}
