import javax.swing.*;
public class MailOrder
{
	public static void main(String args[])
	{
		int item, badItemCount = 0;
		String itemString; 
		final int SIZE = 6;
		int VALID_ITEMS[] = {106, 108, 307, 405, 457, 688};
		int sub;
		boolean foundIt = false;
		final String MSG_YES = "Item Available";
		final String MSG_NO = "Item not found";
            	final int FINISH = 999;
		
		// This is the work done in the getReady() method
		itemString = JOptionPane.showInputDialog(
                             "Enter item number: ");
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
				}
				sub++;
			}
			if(foundIt == true)
			{
				System.out.println(MSG_YES);
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
