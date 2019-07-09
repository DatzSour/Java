// EmployeeBonus.java - This program calculates an employee's productivity bonus. 

import javax.swing.*;

public class EmployeeBonus 
{
	public static void main(String args[])
	{
		// Declare and initialize variables here.
		String employeeName; 
		double numTransactions; 
		String transactString;
		double numShifts; 
		String shiftString;
		double dollarValue;
		String dollarString;
    		double score;
		double bonus;
		final double BONUS_1 = 50.00;
		final double BONUS_2 = 75.00;
		final double BONUS_3 = 100.00; 
		final double BONUS_4 = 200.00;
		
				
		// This is the work done in the housekeeping() method
                employeeName = JOptionPane.showInputDialog("Enter employee's name: ");
		shiftString = JOptionPane.showInputDialog("Enter number of shifts: ");
		transactString = JOptionPane.showInputDialog("Enter number of transactions: ");
		dollarString = JOptionPane.showInputDialog("Enter transactions dollar value: ");

		numShifts = Double.parseDouble(shiftString);
		numTransactions = Double.parseDouble(transactString);
		dollarValue = Double.parseDouble(dollarString);
		// This is the work done in the detailLoop() method
		// Write your code here
		
		// This is the work done in the endOfJob() method	
		// Output.  
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Bonus: $" + bonus);

		System.exit(0);
	}
} 	
