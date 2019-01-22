public class Slogan
{
   private String phrase;
   private static int count = 0;

   //  Constructor: Sets up slogan and counts instances created.
   public Slogan(String str)
   {
      phrase = str;
      count++;
   }

   //  Returns this slogan as a string.
   public String toString()
   {
      return phrase;
   }

   //  Returns the number of instances of this class created.
public static int getCount()
   {
      return count;
   }
}
