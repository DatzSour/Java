// This program uses the programmer-defined Employee class. 

public class EmployeeWages
{
   public static void main(String args[])
   {
      final double LOW = 9.00;
      final double HIGH = 14.65;
      // Instantiate an Employee object
      Employee myGardener = new Employee();

      // Use the get and set methods
      myGardener.setLastName("Greene");
      myGardener.setHourlyWage(LOW);
      System.out.println("My gardener makes " + myGardener.getWeeklyPay() + " per week.");

      // Use the get and set methods
      myGardener.setHourlyWage(HIGH);
      System.out.println("My gardener makes " + myGardener.getWeeklyPay() + " per week.");
      System.exit(0);
   }
}
