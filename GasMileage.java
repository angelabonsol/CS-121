import java.util.Scanner;
public class GasMileage 
{
	//Calculates fuel efficiency based on values entered by the
	//user.
	public static void main(String[] args)
	{
		int miles;
		double gallons, mpg;
		
		Scanner Automobile = new Scanner(System.in); 
		
		System.out.print("Enter the number of miles: ");
		miles = Automobile.nextInt();
				
		System.out.println("Enter the gallons of fuel used:");
		gallons = Automobile.nextFloat();
				
		mpg = miles / gallons;
		
		System.out.println("Miles Per Gallon: " + mpg);

		//the following line closes the scanner
		Automobile.close();
	}

}
