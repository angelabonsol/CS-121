import java.util.Random;
import java.util.Scanner; 
public class RandomNumber_2 {
	public static void main(String[]args)
	{
		String x= "Angela";
		String y= "0 to 9";
		Random generator = new Random();
	      int num1;
	      num1 = generator.nextInt(10);
		Scanner scan = new
		Scanner (System.in);		 
			System.out.println("What is your name? " + x );
			System.out.println("How many sides would you like the die to have? " + y);
			System.out.println("Thank you " + x + ", your die roll came out to " + num1  + ".");
					
	}
	
}