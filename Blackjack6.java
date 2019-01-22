import java.util.*;

public class Blackjack6  // CS 121 Assignment #3 Angela Bonsol
{
	public static void main (String [] args)
	{ 
		final int MAX = 10;
		final int secondMax=11;
		
		int temp, userTotal, dealerTotal, num;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your name?");
			String name=sc.nextLine();
		System.out.println("Hello " + name + ", welcome to a game of Black Jack!");
		
		Random generator = new Random ();
			userTotal = generator.nextInt(MAX) + 2;
			temp = generator.nextInt(MAX) +2;       //2 to 11 
			num = generator.nextInt(secondMax) +1;  //1 to 10
		
		if (userTotal== 11)
			{
			userTotal += num;
			}
		else
			{
			userTotal += temp;
			}	
		System.out.println( name + ", your cards total is: " + userTotal);	
		
		dealerTotal =generator.nextInt(MAX) + 2;
		temp = generator.nextInt(MAX) + 2;
		num = generator.nextInt(secondMax) + 1;	
		
		System.out.println("The dealer's showing: "+ dealerTotal);	
		if (dealerTotal ==11)
			{
			dealerTotal +=num;		
			}
		else
			{
			dealerTotal +=temp;	
			}	
		System.out.println(name + ", would you like to hit or stand?");
	//	String firstQuestion= sc.nextLine();	
		do 
		{	
			String question =sc.nextLine();
			if (question.equals("hit"))
			{
				if (userTotal < 11)
			    		{
					num = generator.nextInt(MAX) + 2; //2 to 11
					userTotal += num;
			    		}
			    else
			    		{
			    		num = generator.nextInt(secondMax) + 1; //1 to 10
			    		userTotal += num;	
			    		}
				System.out.println(name + ", your new total is:" + userTotal );
				if (userTotal < 22 )
					{
					System.out.println(name + ", would you like to hit or stand?");
					}
				if (userTotal > 21) 
					{
					System.out.println("Busted! Sorry "+ name + ", you lose.");
					break; // Breaks loop
					}
			}		
			if (question.equals("stand")) 
			{	
				do  
				{	
					if (dealerTotal < 11)
						{
						temp = generator.nextInt(MAX) + 2; // 2 to 11
						dealerTotal += temp;
						}
					else  if ( (dealerTotal >=11) || (dealerTotal < 17) )
						{
						num= generator.nextInt(secondMax) + 1; // 1 to 10
						dealerTotal += num;
						}
					System.out.println("Dealer now has " + dealerTotal);
				}
				while(dealerTotal < 17);
			if ( dealerTotal> 16)
				{
					if (dealerTotal > 21) {
						System.out.println("Dealer busted!\n" + name + " you win!");
						break;
					}	
					if (userTotal > dealerTotal) 
					{
						System.out.println( name + ", you win!");
						break;
					}	
					else if ( (dealerTotal > userTotal) && (dealerTotal < 22) )
						{
						System.out.println( "Sorry " + name + ", you lose.");
						break;
						}
					else if (userTotal == dealerTotal)
					{
						System.out.println( name + ", its a tie!");
						break;
					}
				}
			break; 
			}
		}
				while (userTotal < 22);
	}
}
