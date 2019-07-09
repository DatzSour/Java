// This program is written by Autumn Neil
import java.util.Scanner;
public class SongSales
{

  public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		System.out.print ("\nThis program calculates the revenue earned and commission paid for a 
		song over the internet.\n");

		String song_name; double song_price; double copies_sold;

		System.out.print ("Please enter the name of the song:\n");
		song_name = console.next();

		System.out.print ("Please enter the selling price in dollars and cents:\n");
		song_price = console.nextDouble();

		System.out.print ("Please enter the number of copies sold:\n");
		copies_sold = console.nextDouble();

		System.out.print ("\n" + copies_sold 
			+" copies of the song " + song_name
			+" were sold at $" + song_price
			+" per copy, for a total revenue of $" + (song_price * copies_sold)
			+"\n");

		System.out.print ("\nThe commission received by your agent is $" + ((song_price * copies_sold) * .12));

		System.out.print ("\nThe commission received by the Internet site is $" + ((song_price * copies_sold) * .03));
 
		System.out.print ("\n"
			+"\n");
	}
}