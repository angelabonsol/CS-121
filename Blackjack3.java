import java.util.Random;
import java.util.Scanner;

public class Blackjack3 {
	public static void main(String[] args)
	{
		String name; 
		final int MAX = 11;
		int random; 
		
		Scanner sc=new Scanner(System.in);
		Random generator = new Random();
		random = generator.nextInt(MAX) + 1;
		
		int count = 1;
		while (count <= 5)
		{
		   System.out.println(count);
		   count++;
		}

		
		System.out.println("Enter your first name:");
		name=sc.nextLine();
		
		System.out.println("Your card:" + random);
		System.out.println("Your card:" + random);
		
		 
	}

}
