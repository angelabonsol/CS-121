public class ReferenceAssignment
{
	public static void main(String[] args)
	   {
	      String name1 = "Steve Wozniak";
	      System.out.println("the contents of the variable name1: " + name1);
	      
	      String name2 = "Steve Jobs";
	      System.out.println("the contents of the variable name2: " + name2);
	      
	      System.out.println(name1==name2);  //remember the equals sign = is for assignment

	      System.out.println("the contents of the variable name2 after we say " + 
	       "name2=name1 is " + name2);
	      
	      System.out.println();
	   }


}
