public class StringEqual
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "abcdefg";
      String str3 = str1 + "efg";
      
      System.out.println("str2 = " + str2);
      System.out.println("str3 = " + str3);
      
      int length1 = str2.length();
      int length2 = str3.length();
      
      if (length1 == length2)
         System.out.println("The strings are equal");
      else
         System.out.println("The strings are not equal");
   
      int var1 = str2.compareTo( str3 ); 
      /*
       *  If both the strings are equal then this method returns 0 
       *  0 else it returns positive or negative value. 
       *  The result is positive if the first string is 
       *  lexicographically greater than the second string
       *  else the result would be negative.
       */
      if (var1<0)
      {
    	  	System.out.println("Str2 is less than str3");
      }
      
      if (var1>0)
      {
    	  	System.out.println("Str2 is greater than str3");
      }
      if (var1==0)
      {
    	  	System.out.println("Str2 is equal to str3");
      }
   }
}