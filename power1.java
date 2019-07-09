//This program is written by Autumn Neil
import java.util.Scanner;
import java.lang.Math;
public class Power1{
    public static void main(String[] input){
		Scanner console = new Scanner(System.in);
			System.out.print("Please enter the base value: ");
			int base = console.nextInt();
			System.out.print("Please enter the exponent value: ");
			int power = console.nextInt();

			double result = math.Pow(base, power);
			System.out.println("The value of" + base + " raised to the exponent " + power  + " is " + result + ".");
	}
}