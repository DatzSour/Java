// SumAndProduct.java - This program computes sums and products. 
// Input:  Interactive.
// Output:  Computed sum and product. 

import javax.swing.*;

public class SumAndProduct
{
   public static void main(String args[]) 
   {
      int number;              	
      String numberString;	
						
      numberString = JOptionPane.showInputDialog("Enter a positive integer or 0 to quit: ");
      number = Integer.parseInt(numberString); 
		
      while(number != 0)
      {
         // call sums() method here 
         
	 // call products() method here
	 
	 numberString = JOptionPane.showInputDialog("Enter a positive integer or 0 to quit: ");
         number = Integer.parseInt(numberString); 
      }
	
      System.exit(0);

   } // End of main() method.
	
	
   // Write sums() method here.
   

   // Write products() method here.
   


} // End of SumAndProduct class.

