public class PassBy2 {
	public static void main (String[] args) 
	{
		
		//declare variables
		//int x = 0;
		//int y = 10;
		
		//arrays
		int x[] = {7};
		int y[]= {10};
		
		//give it a function
		//TrySwap1(x, y);
		TrySwap2(x, y);
		System.out.println("TrySwap1(): results in ");
		System.out.println("TrySwap1(): results in " + x + " " + y);
		
	}
	
	//now write TrySwap method
/*	static int  TrySwap1(int a, int b) {
		
		 int temp;
		 temp =a;
		 a=b;
		 b=temp;
		 
		 System.out.println("A is: " + a + " and b is " + b);
*/		 
//		 return 0;
//	}
	
	static int TrySwap2(int a[0], int b[0]]) {
		
		int temp;
		temp = a[0];
		a[0] = [0];
		b[0] = temp;
		
		System.out.println("a is: " + a[0[ + " and b is: "[0]);
	}
}