import javax.swing.*;
public class PassEntireArray
{
   public static void main(String args[])
   {
      // Declare variables
      final int LENGTH = 4;
      int someNums[]= {10, 12, 22, 35};
      int x;
      System.out.println("At beginning of main method...");
      x = 0;
      while (x < LENGTH) // Print initial array values
      {
         System.out.println(someNums[x]);
         x++;
      }
      // Call method, pass array
      quadrupleTheValues(someNums); 
      System.out.println("At the end of main method...");
      x = 0;
      // Print changed array values
      while (x < someNums.length) 
      {
         System.out.println(someNums[x]);
         x ++;
      }
      System.exit(0);
   } // End of main() method.
   public static void quadrupleTheValues(int [] vals)
   {
      final int LENGTH = 4;
      int x;
      x = 0;
      // Print array values before they are changed
      while(x < LENGTH) 
      {
         System.out.println(
             " In quadrupleTheValues() method, value is " +
             vals[x]);
         x++;
      }
      x = 0;
      while(x < LENGTH) // This loop changes array values
      {
         vals[x] = vals[x] * 4;
         x++;
      }
      x = 0;
      // Print array values after they are changed
      while(x < LENGTH) 
      {
         System.out.println(" After change, value is " +
             vals[x]);
         x++;
      }
   } // End of quadrupleTheValues method
} // End of PassEntireArray class.

