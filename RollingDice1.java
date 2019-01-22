public class RollingDice1
{
//  Creates two Dice objects and rolls them several times.
   public static void main(String[] args)
   {
	  int intDieRoll= 0;   
      DiceVer1 die1 = new DiceVer1();
   
      int numRolls=5;
      
      for(int i=0; i<numRolls; i++)
      {
      intDieRoll= die1.roll();  
      System.out.println( "Die intDieRoll: " + intDieRoll + "\n");
      }
      
      System.out.println( "Die OneOBJ: " + die1 + "\n");
     
      
      //System.out.println("Die TwoOBJ: " + die2 + "\n" );
      
      //System.out.println
     
      System.out.println( "Die OneMethodCall: " + die1 + "\n");
 
   }
}
