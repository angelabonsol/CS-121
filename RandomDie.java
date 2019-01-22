import java.util.Random;
import java.util.Scanner; 
public class RandomDie {
	public static void main(String[]args)
	{
		String x;
		int y;
		int gen;
		Random t = new Random();
		Scanner scan = new Scanner (System.in);
			 
			System.out.println("What is your name? ");
			x = scan.nextLine();
			System.out.println("How many sides would you like the die to have? ");
			y = scan.nextInt();
			for (gen = 0; gen <=1; gen++)
			{
				System.out.println(t.nextInt(100));
			}
			System.out.println("Thank you " + x + ", your die roll came out to " + t.nextInt(y) + ".");
			
			
	}
	
}