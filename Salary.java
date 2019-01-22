import java.util.Scanner;
public class Salary
{
	public static void main (String[] args)
	{
		double currentSalary; // employee's current salary
		double raise =0 ; // amount of the raise
		double newSalary; // new salary for the employee
		
		String rating; // performance rating
		Scanner scan = new Scanner(System.in);
		System.out.print ("Enter the current salary: ");
		// Your code start from here
		currentSalary= scan.nextDouble(); //entered decimal(Double) is currentSalary
		
		System.out.print ("Enter Rating:"); 
		rating = scan.next(); //entered integer is the rating
		
		switch (rating) // "(rating)" is the switch key.
		{ 
		case "Poor":
			raise = ((1.5/100)*currentSalary);
			break; 	// So that it doesn't execute other cases. It stops on that 'block'. 
		case "Good":
			raise = ((4/100)*currentSalary);
			break;
		case "Excellent":
			raise = ((6/100)*currentSalary);
			break;
		default:
			System.out.print("Invalid Input");
			break;
		}
		
		newSalary = currentSalary + raise ;
	
		System.out.println("Current Salary:" + currentSalary );
		
		System.out.println ("Raised Salary:" + newSalary);
		
	}
}
