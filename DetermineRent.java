import javax.swing.*;

public class DetermineRent
{
	public static void main(String args[]) 
	{
		// Declare variables.
		double rent[][] =	{{350, 390, 435}, 
					{400, 440, 480},
					{475, 530, 575},
					{600, 650, 700},
					{1000, 1075, 1150}}; 
		int floor;   
		int bedroom;
		String floorString;
		String bedroomString;
		int QUIT = 99;
				
		// Work done in the getReady() method
		floorString = JOptionPane.showInputDialog(
                                "Enter floor or 99 to quit: ");
		floor = Integer.parseInt(floorString);
		
		while(floor != QUIT)
		{	
			// Work done in the determineRent() method
			bedroomString = JOptionPane.showInputDialog(
                                "Enter number of bedrooms: ");
			bedroom = Integer.parseInt(bedroomString);
			System.out.println("Rent is $" +
                                           rent[floor][bedroom]);
			floorString = JOptionPane.showInputDialog(
                                "Enter floor or 99 to quit: ");
			floor = Integer.parseInt(floorString);
		}
		// Work done in the finish() method
		System.out.println("End of program");
		System.exit(0);
	} // End of main() method.
} // End of DetermineRent class.

