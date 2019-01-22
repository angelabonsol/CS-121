public class Task1 {
	public static void main(String[] args)
	{
		int a = 5, b=11;
		boolean flag = true;
		
		if(a<=b)
			System.out.println("a<=b expression is true");
		else 
			System.out.println("a<=b expression is false");
		
		if((a+5)>=b)
			System.out.println("(a+5)>=b expression is true");
		else
			System.out.println("(a+5)>=b expression is false");
		
		if(a<b/2)
			System.out.println("a<b/2 expression is true");
		else
			System.out.println("a<b/2 expression is false");
		if(a !=b)
			System.out.println("a !=b expression is true");
		else
			System.out.println("a !=b expression is false");
		if(!(a==b))
			System.out.println("!(a==b) expression is true");
		else
			System.out.println("!(a==b) expression is false");
		if ((a<b)||(a>b))
			System.out.println("(a<b)||(a>b) expression is true");
		else 
			System.out.println("(a<b)||(a>b) expression is false");
		if ((a < b) && (a > b))
			System.out.println("(a < b) && (a > b) expression is true");
		else
			System.out.println("(a < b) && (a > b) expression is false");
		if (((a >= b) || !flag) && flag)
			System.out.println("((a >= b) || !flag) && flag expression is true");
		else 
			System.out.println("((a >= b) || !flag) && flag expression is false");
	}

}