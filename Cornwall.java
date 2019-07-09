// Cornwall.java - This program computes hotel guest rates.
// Input:  Days in stay and meals included
// Output:  Hotel guest rate
import javax.swing.*;

public class Cornwall
{
	public static void main(String args[]) 
	{
		int days;
		String dayString; 
		String mealPlan; 
		String question; 
		double rate = 0.00; 
		
		dayString = JOptionPane.showInputDialog("How many days do you plan to stay? "); 
		days = Integer.parseInt(dayString);
		question = JOptionPane.showInputDialog(" Do you want a meal plan? Y or N: "); 
		// Figure out which arguments to pass to the computeRate() method and 
		// then call the computeRate() method
		
		System.out.println("The rate for your stay is: " + rate);				
		System.exit(0);

	} // End of main() method.
	
	
	// Write computeRate methods here.
	
} // End of Cornwall class.

