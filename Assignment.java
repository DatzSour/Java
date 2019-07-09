//This code is written by Autumn Neil.
import javax.swing .*;    
import java.awt.event.ActionListener;    
import java.awt.event.ActionEvent;   
import java.awt.*;


class Assignment extends JFrame implements ActionListener{
 JLabel label1, label2, label3;
 JButton b1, b2;
 JTextField txtField1, txtField2, txtField3;
 
 public Assignment(){
     super("Assignment 1");
  setLayout(new GridLayout(5,2));
  setSize(300, 500);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  //initializing label
  label1 = new JLabel("Enter First Number :",JLabel.RIGHT);
  label2 = new JLabel("Enter Second Number :",JLabel.RIGHT);
  label3 = new JLabel("Sum :",JLabel.RIGHT);
  
  //initializing buttons;
  b1 = new JButton("Calculate");
  b2 = new JButton("Exit");

  
  //adding eventlistener
  b1.addActionListener(this);
  b2.addActionListener(this);

  //initializing textfield
   txtField1 = new JTextField();
   txtField2 = new JTextField();
   txtField3 = new JTextField();
   
  //adding to the frame
  add(label1,0);
  add(txtField1);
  add(label2);
  add(txtField2);
  add(label3);
  add(txtField3);
  add(b1);
  add(b2);

 }//end of constructor
  
 public void actionPerformed(ActionEvent ae)
 {
     double a, b, c;
     if (ae.getSource() == b1)
     {
         a = Double.parseDouble(txtField1.getText().trim());
         b = Double.parseDouble(txtField2.getText().trim());
         c = a + b;
         txtField3.setText(Double.toString(c));
     }
     else if (ae.getSource() == b2)
     {
         System.exit(0);
     }
 }
      
 
 public static void main(String[] args) {
     Assignment demo = new Assignment();
 }

}
