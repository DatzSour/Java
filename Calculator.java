// Calculator.java - This program performs arithmetic, ( +. -, *. /, % ) on two numbers
// Input:  Interactive.
// Output:  Result of arithmetic operation

import javax.swing.*;

public class Calculator
{
	public static void main(String args[]) 
	{
		double numberOne, numberTwo;              	
		String numberOneString, numberTwoString;
		String operation;
		double result; 	
						
		numberOneString = JOptionPane.showInputDialog("Enter the first number: ");
		numberOne = Double.parseDouble(numberOneString); 
		numberTwoString = JOptionPane.showInputDialog("Enter the second number: ");
		numberTwo = Double.parseDouble(numberTwoString); 
		operation = JOptionPane.showInputDialog("Enter an operator (+.-.*,/,%): ");
		
		// Call performOperation method here		
		

		System.out.format("%.2f",numberOne);
		System.out.print(" " + operation + " ");
		System.out.format("%.2f", numberTwo);
		System.out.print(" = ");
		System.out.format("%.2f", result);
	
		System.exit(0);

	} // End of main() method.
	
	
	// Write performOperation method here.
	

} // End of Calculator class.

