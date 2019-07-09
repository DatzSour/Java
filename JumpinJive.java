// JumpinJive.java - This program looks up and prints the names and prices of coffee orders.  
// Input:  Interactive.
// Output:  Name and price of coffee orders or error message if add-in is not found. 

import javax.swing.*;

public class JumpinJive
{
	public static void main(String args[]) throws Exception
	{
		// Declare variables.
		String addIn;        // Add-in ordered by customer.
		final int NUM_ITEMS = 5; // Named constant
		// Initialized array of add-ins.
		String addIns[] = {"Cream", "Cinnamon", "Chocolate", "Amaretto", "Whiskey"}; 
		// Initialized array of add-in prices.
		double addInPrices[] = {.89, .25, .59, 1.50, 1.75};
		boolean foundIt; 
		int x;   		  // Loop control variable.
		double orderTotal = 2.00; // All orders start with a 2.00 charge

		// Get user input.
		addIn = JOptionPane.showInputDialog("Enter coffee add-in or XXX to quit: ");
		// Write the rest of the program here.
		
	} // End of main() method.
} // End of JumpinJive class.

