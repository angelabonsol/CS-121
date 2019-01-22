public class Dice
{
   private final int MAX = 6;  // maximum face value
   private int faceValue;  // current value showing on the die
      
   public Dice() //  Constructor: Sets initial face value
   {
      faceValue = 1;
   }

   public int roll() //Rolls die and returns result
   {
      faceValue = (int)(Math.random() * MAX) + 1;
      return faceValue;
   }

   public void setFaceValue(int value) //  FaceValue mutator
   {
      faceValue = value;
   }

   public int getFaceValue() //FaceValue accessor
   {
      return faceValue;
   }

   //  Returns a string representation of this die.
   public String toString()
   {
      String result = Integer.toString(faceValue);

      return result;
   }
}
