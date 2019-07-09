// This program is written by Autumn Neil
import java.util.Scanner;
public class Deli
{

  public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		System.out.print ("Welcome to the Sandwich Corral!\n"
			+"\nYou will be given choices for building your sandwich."
			+"\nPlease enter your selection after each prompt "
			+"and then press the ENTER key.\n"
			+"\n");	
		
		String sandwich_choice, bread_choice, condiment_choice, drink_choice, price;
		System.out.print ("Please enter your sandwich choice:\n"
			+ "Ham, Beef, Reuben, PBJ, Cheese, or Vegetarian\n");
		sandwich_choice = console.next();
		
		System.out.print ("Please enter your bread choice:\n"
			+ "Rye, Wheat, White, Sourdough, or Pumpernickel\n");
		bread_choice = console.next();
		
		System.out.print ("Please enter your condiment choice:\n"
			+ "Mayo, Mustard, Ketchup, or none\n");
		condiment_choice = console.next();
		
		System.out.print ("Please enter your drink choice:\n"
			+ "Coke, Diet Coke, Tea, Coffee, or Water\n");
		drink_choice = console.next();

		System.out.print ("Please enter 3.99 for a half sandwich or 5.99 for a " 
			+ "whole sandwich:\n");
		price = console.next();

		System.out.print ("\nYou have entered the following information:\n"
			+ "\nSandwich Choice:\t" + sandwich_choice
			+ "\nBread Choice:\t\t" + bread_choice
			+ "\nCondiment Choice:\t" + condiment_choice
			+ "\nDrink Choice:\t\t" + drink_choice
			+"\n"
			+ "\nTab:\t\t\t" + price
			+ "\n");

		System.out.print ("Thank you for choosing Sandwich Corral.\n"
			+"\n"
			+"Have a great day!"
			+"\n"
			+"\n");
	}
}