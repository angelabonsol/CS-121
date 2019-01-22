public class StudentBody 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Address school = new Address("800 Lancaster Ave.","Villanova", "PA", 19085);

      Address jHome = new Address("21 Jump Street", "Lynchburg",
                                   "VA", 24551);
      Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
      
      Address sHome= new Address ("121 Becker Street", "London", "LA", 7777);
      
      Telephone jTelephone= new Telephone("+1-362-2627-738");
      
      Telephone mTelephone= new Telephone ("+1-992-2829-289");
      
      Telephone sTelephone= new Telephone("+1-201-9939-065");
      
      Student john = new Student("John", "Smith", jHome, school, jTelephone);
 
      Student marsha = new Student("Marsha", "Jones", mHome, school, mTelephone);
      
      Student sherlock= new Student("Sherlock", "Holmes", sHome, school, sTelephone);
      
      

      System.out.println(john);
      System.out.println();
      System.out.println(marsha);
      System.out.println();
      System.out.println(sherlock);
      
   }
}
