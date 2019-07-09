// StudentScores.java - This program interactively reads a 
// variable number of student test scores, stores the 
// scores in an array, and then sorts the scores in
// ascending order. 
// Input:  Interactive
// Output:  Sorted list of student scores 

import javax.swing.*;

public class StudentScores
{
	public static void main(String args[]) throws Exception
	{
		// Declare variables
                // Maximum size of array
		final int SIZE = 100;		
          	String stuScoreString; 
                // Array of student scores
		int scores[] = new int[SIZE];   
                int x;
                int temp;
                // Actual number of elements in array
		int numberOfEls = 0; 	      
		int comparisons;
		final int QUIT = 999;
		Boolean didSwap;
		
		// Work done in the fillArray method
		x = 0;
		stuScoreString = JOptionPane.showInputDialog(
                        "Enter a score or " + QUIT + " to quit ");
		scores[x] = Integer.parseInt(stuScoreString); 
		x++;	
		while(x < SIZE && scores[x-1] != QUIT)   
		{
			stuScoreString = JOptionPane.showInputDialog(
                                "Enter a score or " + QUIT + " to quit ");
			scores[x] = Integer.parseInt(stuScoreString); 
                        x++;
		}  // End of input loop
		numberOfEls = x-1;
		comparisons = numberOfEls -1;

		// Work done in the sortArray() method
		didSwap = true;	// Set flag to true
		// Outer loop controls number of passes over data
		while(didSwap == true) // Test flag.
		{
			x = 0;
			didSwap = false;
			// Inner loop controls number of items to compare
			while(x < comparisons)
			{
				if(scores[x] > scores[x+1]) // Swap?
				{
					// Work done in the swap() method
					temp = scores[x + 1];
					scores[x+1] = scores[x];
					scores[x] = temp;
					didSwap = true;
				}
				x++;   // Get ready for next pair
			}
			comparisons--;
		} 

		
		// Work done in the displayArray() method
		x = 0;
		while(x < numberOfEls)
		{
			System.out.println(scores[x]);
			x++;
		}
		System.exit(0);
	} // End of main() method 
} // End of StudentScores class

