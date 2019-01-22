public class casting
{
   public static void main(String[] args)
   {
    int total = 50;

    float result =  total / 6; //No cast yet, integer division
    System.out.println("result= " + result);

    //three different ways to cast ints to floats
    result =  (float) total / 6;
    System.out.println("result= " + result);
    result =   total / 6.0f;
    System.out.println("result= " + result);
    result =   total / (float)6;
    System.out.println("result= " + result);
   
   }
}
