import java.util.Scanner; 

public class suggestActivity {
	public static void main (String[] args) 
	{
		int temp; 
		
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("What is the temperature right now?");
		temp= sc.nextInt();
		
		if (temp > 80)
		{
			System.out.println("It is a perfect weather to go swimming today!");
		}
		
		else if ( 60 > temp || temp > 80 )
		{
			System.out.println("Let's go play tennis today!");
		}
		
		else if ( 40 > temp || temp > 60 )
		{
			System.out.println("It's just about right to play golf today!");
		}
		
		else if ( 40 > temp )
		{
			System.out.println("It's a good day to go skiing today!");
		}
		
	}

}
