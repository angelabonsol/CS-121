public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private Telephone num;
   
   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student(String first, String last, Address home,
                   Address school, Telephone num)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      Telephone= num; //constructor
   }

//  Returns a string description of this Student object.
public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;
      result += "Telephone:\n" + Telephone; //string method

      return result;
   }
}
