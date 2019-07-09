// GrossPay.java - This program computes an employee's
// gross pay. 
// Input:  Interactive.
// Output:  The employee's hours worked and their gross pay. 

import javax.swing.*;

public class GrossPay
{
	public static void main(String args[]) 
	{
		double hours;	
		final double PAY_RATE = 12.00;	
		double gross;
		     	
		hours = getHoursWorked();
		gross = hours * PAY_RATE;
		
		System.out.println("Hours worked: " + hours);
		System.out.println("Gross pay is: " + gross);
	
		System.exit(0);

	} // End of main() method.
	
	public static double getHoursWorked()
	{
		double workHours;
		String workHoursString;

		workHoursString = JOptionPane.showInputDialog(
                         "Please enter hours worked: ");
		workHours = Double.parseDouble(workHoursString); 
		
		return workHours;
		
	} // End of getHoursWorked method

} // End of GrossPay class.

