import java.util.Random;
import java.util.Scanner;

public class DieRollLoop {
	public static void main(String[]args) {
		String name;  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("What is your name?");
		 name= sc.nextLine();
		 System.out.println("How many sides for the die?");
		 int sides=sc.nextInt();
		 System.out.println("How many rolls (MAX 7 Rolls)?");
		 int rolls=sc.nextInt();
		 int intDieRoll=sides;
		 DiceVer1 die1 = new DiceVer1();
		 int numRolls=rolls;
		 Random generator= new Random();
		 int num1;
		 num1 = generator.nextInt(sides) + 1;
		 System.out.println("Your die rolls are as follows:");
		 for (int i=0; i<numRolls; i++)
		 {
			 intDieRoll=die1.roll();
			 System.out.println(intDieRoll);
		 }
		 
	}
	
}
