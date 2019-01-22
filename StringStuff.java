
public class StringStuff 
{
	public static void main(String[ ] args)
	{
		String name1 = new String("Steve Wozniak");
		
		String name2 = new String ("Steve Wozniak");
		
		String name3 = "Stebe Wozniak";
		
		String name4 = "Steve Wozniak"; 
		
		System.out.println(name1==name2);

		System.out.println(name3==name4);
		
		name1=name2;
		System.out.println(name1==name2);
	}

}
