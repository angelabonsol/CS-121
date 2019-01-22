import java.util.*;

public class Blackjack1{

  public static void main(String[] args){
	
	String name;
    final int MAX = 11;
    int userRandom, userRandom2, userSum, dealerRandom, dealerSum;

    Scanner scan = new Scanner(System.in); // Scan for a number
    Random generator = new Random();  // Create a random number
    Random random  = new Random();
    
    userRandom = generator.nextInt(MAX) + 1; // set userRandom to random generated num
    userRandom2 = random.nextInt(MAX) + 1;
    
    System.out.println("Enter your first name:");
	name=scan.nextLine();
	
    System.out.println( name + ", your cards are:" + userRandom + ", " + userRandom2 );
    
    userSum = userRandom + userRandom2; // set userSum to the random generated number

    Random dealerGenerator = new Random();  // create random number for dealer

    dealerRandom = dealerGenerator.nextInt(MAX) + 1;  //

    dealerSum = dealerRandom; // set dealerSum to dealer's random number

   String answer= "stand" || "hit" ;
   System.out.println("Would you like to hit or stand?");
    answer=scan.nextLine();
    while ( )
	 {
    	if (answer== "hit")
    	{
    	userRandom = generator.nextInt(MAX) + 1;
    	System.out.println( name + ", your new card is:" + userRandom);
    	System.out.println("Would you like to hit or stand?");
    	answer=scan.nextLine();
    	}
    	else
    	{
    		
    	}
    	
	 }
     	 System.out.println("Your final value is:" + userSum);
     	 
// Create a while loop here to see if you should enter hit or don't hit

// while(entered string is "stand" or "hit") -- do below 

    if (userSum <= 10){ // check if the random number generate is less than 11
      Random newGen = new Random();
      userSum += newGen.nextInt(MAX)+1; // adds a new random number to userSum if parameters are met

      System.out.println("your new value is:" + userSum);

    }
    else 
    {
    
    }

    while (true)
    // while( dealerSum is less than 17), keep doing below)

    if (dealerSum <= 10){
      Random newGenDealer = new Random();
      userSum += newGenDealer.nextInt(MAX)+1;

      System.out.println(dealerSum);

    }



  }
}