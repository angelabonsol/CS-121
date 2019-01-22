public class DiceVer1
{
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die

   public DiceVer1() //  Constructor: Sets the initial face value

   {
      faceValue = 1;
   }

   public int roll() //  Rolls the die and returns the result
   {
      faceValue = (int)(Math.random() * MAX) + 1;
      return faceValue;
   }

   public String toString() //  String representation of the die
   {
      String result = "Face";
      //String result = Integer. toString(faceValue);

      return result;
   }
}
