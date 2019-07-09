import javax.swing.JOptionPane; 
public class CustomerBill
{
   public static void main(String args[])
   { 
     // Declare variables local to main()
     String name;
     String balanceString;
     double balance;
     
     // Get interactive input
     name = JOptionPane.showInputDialog(
                        "Enter customer's name: ");
     balanceString = JOptionPane.showInputDialog(
                        "Enter customer's balance: ");

     // Convert String to double
     balance = Double.parseDouble(balanceString);

     // Call nameAndAddress() method
     nameAndAddress();

     // Output customer name and address
     System.out.println("Customer Name:  " + name);
     System.out.println("Customer Balance:  " + balance);   
      
   }  
   public static void nameAndAddress()
   {
      // Declare and initialize local, constant Strings
      final String ADDRESS_LINE1 = "ABC Manufacturing";
      final String ADDRESS_LINE2 = "47 Industrial Lane";
      final String ADDRESS_LINE3 = "Wild Rose, WI 54984";

      // Output
      System.out.println(ADDRESS_LINE1);
      System.out.println(ADDRESS_LINE2);
      System.out.println(ADDRESS_LINE3);
   }  // End of nameAndAddress() method
}


