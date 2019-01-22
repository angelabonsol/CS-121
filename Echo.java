import java.util.Scanner;

public class Echo
{
   //-----------------------------------------------------------------
   //  Reads a character string from the user and prints it.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      String message;
      Scanner KeyInput = new Scanner(System.in);

      System.out.println("Enter a line of text:");

      message = KeyInput.nextLine();

      System.out.println("You entered: \"" + message + "\"");

      KeyInput.close();  //Closes the scanner object
   }
}

