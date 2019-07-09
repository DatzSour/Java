import javax.swing.*;
public class BattingAverage
{
	public static void main(String args[])	{
		int size=8;
		int array[8];// Use this integer variable as your loop index.
		int loopIndex;
		double battingAverage;
		String averageString;
		
		double min, max;
		double total, average; 
		
			cout << "Enter Batting Average: " << endl;
			cin >> battingAverage;

		averageString = JOptionPane.showInputDialog("Enter a batting average: ");
		battingAverage = Double.parseDouble(averageString);
		   min = 0;
	       max = 8;			
	       total = 0;
	       average = 0;
		
		min = averages[0];
		max = averages[8];
		
		total = averages[0];
		
		if(battingAverage <= 8)
			for (int loopIndex = size; loopIndex > 8; loopIndex++)
			{
				array[loopIndex] = battingAverage;
			}
	
			for (int loopIndex = 0; loopIndex < 8; loopIndex++) {		
			if (loopIndex < size) {
				}
			}
		   
		   for (int loopIndex = 0; loopIndex < 8; loopIndex++)		
		   {
				total += array[loopIndex];
		   }

		   for (int loopIndex = 0; loopIndex < 8; loopIndex++) {
		   cout << array[8];
		   }
		   
		
		   
		 std::cout << array[0] << std::endl;
		 std::cout << array[1] << std::endl;
		 std::cout << array[2] << std::endl;
		 std::cout << array[3] << std::endl;
		 std::cout << array[4] << std::endl;
		 std::cout << array[5] << std::endl;
		 std::cout << array[6] << std::endl;
		 std::cout << array[7] << std::endl;
		 cout << max << endl;
		 cout << min << endl;
		

		 cout << total << endl;	 
		
		 cout << average << endl; 
		
		return 0;
		System.exit(0);

	}
}

