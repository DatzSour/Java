import javax.swing.*;
public class MailOrder2
{
	public static void main(String args[])
	{
		int item,badItemCount = 0;
		double price = 0.0;
		String itemString; 
		final int SIZE = 6;
		int VALID_ITEMS[] = {106, 108, 307, 405, 457, 688};
		double VALID_PRICES[] = {0.59, 0.99, 4.50, 15.99, 
                                        17.50, 39.00};
		int sub;
		boolean foundIt = false;
		final String MSG_YES = "Item Available";
		final String MSG_NO = "Item not found";
            	final int FINISH = 999;
		
		// This is the work done in the getReady() method
		itemString = JOptionPane.showInputDialog(
             		     "Enter next item number or " +
  			     FINISH + " to quit ");
		item = Integer.parseInt(itemString);
		
		while(item != FINISH)
		{
			// This is the work done in the findItem() method
			foundIt = false;
			sub = 0;
			while(sub < SIZE)
			{
				if(item == VALID_ITEMS[sub])
				{
					foundIt = true;
					price = VALID_PRICES[sub];
				}
				sub++;
			}
			if(foundIt == true)
			{
				System.out.println(MSG_YES);
				System.out.println("The price of " + item + 
 					           " is " + price);
			}
			else
			{
				System.out.println(MSG_NO);
				badItemCount++;
			}
			itemString = JOptionPane.showInputDialog(
       			             "Enter next item number or " + 
                                     FINISH + " to quit ");
			item = Integer.parseInt(itemString);
		}
		// This is the work done in the finishUp() method
		System.out.println(badItemCount + 
                                   " items had invalid numbers");
		System.exit(0);
	}
}
