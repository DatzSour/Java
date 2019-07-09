// This program calculates your age in the year 2050.
// Input:  None.
// Output: Your current age followed by your age in 2050.

public class NewAge2
{
   public static void main(String args[])
   {
      int currentAge = 25;
      int newAge;
      int currentYear = 2014;
      final int YEAR = 2050;

      newAge = currentAge + (YEAR - currentYear);

      System.out.println("My Current Age is " + currentAge);
      System.out.println("I will be " + newAge + " in YEAR.");

      System.exit(0);
   }
}
