public class RollingDice
{
   //  Creates two Dice objects and rolls them several times.
   public static void main(String[] args)
   {
      int sum;

      Dice die1 = new Dice();
      Dice die2 = new Dice();

      die1.roll();
      die2.roll();
      System.out.println("Die One: " + die1 + ", Die Two: " + die2);
      sum = die1.getFaceValue() + die2.getFaceValue();
      System.out.println("Sum: " + sum);

      die1.roll();
      
      int setVal = 3;
      if ((setVal>0) && (setVal<7))
    	  ;
    	  {
    	  
      }
    	  System.out.println(((setVal>0) && (setVal<7)));
    	  
      die2.setFaceValue(4);
      System.out.println("\nDie One: " + die1 + ", Die Two: " + die2);
      sum = die1.getFaceValue() + die2.getFaceValue();
      System.out.println("Sum: " + sum);

      sum = die1.roll() + die2.roll();
      System.out.println("\nDie One: " + die1 + ", Die Two: " + die2);
      System.out.println("New sum: " + sum);
   }
}
