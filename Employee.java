// Employee class

public class Employee
{
	
   private String lastName;
   private double hourlyWage;
   private double weeklyPay;

   public void setLastName(String name)
   {
      lastName = name;
      return;
   }

   public void setHourlyWage(double wage)
   {
      hourlyWage = wage;
      calculateWeeklyPay();
      return;
   }

   public String getLastName()
   {
      return lastName;
   }

   public double getHourlyWage()
   {
      return hourlyWage;
   }
   
   public double getWeeklyPay()
   {
      return weeklyPay;
   }

   private void calculateWeeklyPay()
   {
      final int WORK_WEEK_HOURS = 40;
      weeklyPay = hourlyWage * WORK_WEEK_HOURS;
      return;
   }
} // End Employee class
