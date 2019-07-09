// This program is written by Autumn Neil
import java.util.Scanner;
public class Swap
{
    public static void main(String[] input)
    {
		Scanner console = new Scanner(System.in);

		System.out.print ("You will be asked to enter two names.\n"
			+"\nThe program will display the names you entered, swap 
			the names, and then display them after they are swapped."
			+"\n");
			
        String str1, str2, strtemp;
        
        System.out.print("Please enter the first name: ");
        str1 = scan.nextLine();
        System.out.print("Please enter the second name: ");
        str2 = scan.nextLine();
		System.out.println("\nYou entered " +str1+ " as your first name and " +str2+ " as your second name\n");
		
		strtemp = str1;
        str1 = str2;
        str2 = strtemp;
        
        System.out.println("\nAfter swapping the names,\n");
        System.out.print("The first name is " +str1+ "\n");
        System.out.print("and the second name is " +str2+ "\n");
    }
}