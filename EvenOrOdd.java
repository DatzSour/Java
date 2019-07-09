// EvenOrOdd.java - This program determines if a number
// input by the user is an even number or an odd number.  
// Input:  Interactive.
// Output:  The number entered and whether it is even or odd.

import javax.swing.*;

public class EvenOrOdd
{
	public static void main(String args[]) 
	{
		int number;              	
		String numberString;	      	
				
		numberString = JOptionPane.showInputDialog(
                      "Enter a number or -999 to quit: ");
		number= Integer.parseInt(numberString); 
	
		while(number != -999)
		{
			even_or_odd(number);
			numberString = JOptionPane.showInputDialog(
                              "Enter a number or -999 to quit: ");
			number= Integer.parseInt(numberString); 
		}
			
		System.exit(0);

	} // End of main() method.
	
	public static void even_or_odd(int number)
	{
		if((number % 2) == 0)
			System.out.println("Number: " + number +
                                           " is even.");
		else
			System.out.println("Number: " + number +
                                           " is odd.");
	} // End of even_or_odd method.
} // End of EvenOrOdd class.
