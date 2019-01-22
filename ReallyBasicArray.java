public class ReallyBasicArray
{
   //Creates, populates and prints out an array
   public static void main(String[] args)
   {
      int[] MyFirstArray = new int[10];
      
      //  Initialize the array values
      for (int index = 0; index < 10; index++)
    	  MyFirstArray[index] = index;
      
      
    //Print the array values (One of two ways)
      for (int index = 0; index < 10; index++)
         System.out.print(MyFirstArray[index] + "  ");
      
      
   }
}
