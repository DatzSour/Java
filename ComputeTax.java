// ComputeTax.java - This program computes tax given a
// balance and a rate 
// Input:  Interactive.
// Output:  The balance, tax rate, and computed tax. 

import javax.swing.*;

public class ComputeTax
{
	public static void main(String args[]) 
	{
		double balance;              	
		String balanceString;	
		double rate;
		String rateString;      	
				
		balanceString = JOptionPane.showInputDialog(
                                "Enter balance: ");
		balance = Double.parseDouble(balanceString); 
		rateString = JOptionPane.showInputDialog(
                             "Enter rate: ");
		rate = Double.parseDouble(rateString); 
	
		computeTax(balance, rate);
					
		System.exit(0);

	} // End of main() method.
	
	public static void computeTax(double amount, double rate)
	{
		double tax;

		tax = amount * rate;
		System.out.println("Amount: " + amount + " Rate: " +
                                    rate + " Tax: " + tax);
		
	} // End of computeTax method

} // End of ComputeTax class.

