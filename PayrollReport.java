import javax.swing.JOptionPane;
public class PayrollReport
{
   public static void main(String args[])
   {   
      String name;
      String grossString; 
      double gross, deduct, net; 
      final double RATE = 0.25;
      final String QUIT = "XXX";
      final String REPORT_HEADING = "Payroll Report";
      final String END_LINE = "**End of report";  
      
      // This is the work done in the housekeeping() method
      System.out.println(REPORT_HEADING);
      name = JOptionPane.showInputDialog(
                         "Enter employee’s name: ");
    
      while(name.compareTo(QUIT) != 0)
      {
         // This is the work done in the detailLoop() method
         grossString = JOptionPane.showInputDialog(
                       "Enter employee’s gross pay: ");
         gross = Double.parseDouble(grossString);
         deduct = gross * RATE;
         net = gross - deduct;
         System.out.println("Name: " + name);
         System.out.println("Gross Pay: " + gross);
         System.out.println("Deductions: " + deduct);
         System.out.println("Net Pay: " + net);
         name = JOptionPane.showInputDialog(
                "Enter employee’s name: ");
      }
      // This is the work done in the endOfJob() method
      System.out.println(END_LINE);
     }
}
