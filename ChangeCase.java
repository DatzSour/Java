// ChangeCase.java - This program converts a string to lowercase and uppercase.
// Input:  Interactive
// Output:  Uppercase and lowercase versions of the user-entered string.
import javax.swing.*;

public class ChangeCase
{
	public static void main(String args[]) 
	{
		String sample;
		String result;

		sample = JOptionPane.showInputDialog("Enter a string or done when you want to quit.");
		 
           	while(sample.compareTo("done") != 0)
		{
			// Call toLowerCase() method here and print the result.		
			
			System.out.println("Lowercase: " + result);
			// Call toUpperCase() method here and print the result.	
			
			System.out.println("Uppercase: " + result);
			sample = JOptionPane.showInputDialog("Enter a string or done when you want to quit.");
		}						
		
		System.exit(0);

	} // End of main() method.
		

} // End of ChangeCase class.

