import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Blackjack 
{
	public static void main(String[] args)
	{
		String name; 
		final int MAX = 10;
		int deal1, deal2, deal3, deal4;
		Scanner sc=new Scanner(System.in);
		Random generator = new Random();
		deal1=generator.nextInt(MAX) + 1;
		deal2=generator.nextInt(MAX) + 1;
		deal3=generator.nextInt(MAX) + 1;
		deal4=generator.nextInt(MAX) + 1;
		System.out.println("Enter your first name:");
		name=sc.nextLine();
		System.out.println( name + ", your cards are:" + deal1 + "," + deal2 );
		System.out.println( name + ", you got: " + (deal1 + deal2)  );
		
		
		System.out.println("The Dealer's cards are: " + deal3 + "," + deal4 );
		System.out.println("The Dealer got:" + (deal3 + deal4) );
		
	
	
	}
	
	

}
