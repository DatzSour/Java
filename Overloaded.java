// Overloaded.java - This program illustrates overloaded 
// methods. 
// Input:  None.
// Output:  Bill printed in various ways.  
import javax.swing.*;
public class Overloaded
{
	public static void main(String args[]) 
	{
		double bal = 250.00, discountRate = .05; 
		String msg = "Due in 10 days.";  
		printBill(bal);  			// Call version #1.
		printBill(bal, discountRate);  		// Call version #2.
		printBill(bal, msg);  			// Call version #3.
		printBill(bal, discountRate, msg); 	// Call version #4.
		System.exit(0);

	} // End of main() method.
	
	// printBill() method version #1.
	public static void printBill(double balance)	
	{
		System.out.println("Thank you for your order.");
		System.out.println("Please remit " + balance);		
	} // End of printBill version #1 method.

	// printBill() method version #2.
	public static void printBill(double balance,
                                     double discount)	
	{
		double newBal;
		newBal = balance - (balance * discount);
		System.out.println("Thank you for your order.");
		System.out.println("Please remit " + newBal);		
	} // End of printBill version #2 method.

	// printBill() method version #3.
	public static void printBill(double balance,
                                     String message)	
	{
		System.out.println("Thank you for your order.");
		System.out.println(message);
		System.out.println("Please remit " + balance);		
	} // End of printBill version #3 method.

	// printBill() method version #4.
	public static void printBill(double balance,
                                     double discount,
                                     String message)		
        {
		double  newBal;
		newBal = balance - (balance * discount);
		System.out.println("Thank you for your order.");
		System.out.println(message);
		System.out.println("Please remit " + newBal);		
	} // End of printBill version #4 method.
} // End of Overloaded class.

