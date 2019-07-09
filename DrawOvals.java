//Written by Autumn Neil.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawOvals extends JApplet implements ActionListener {
	
        private JTextField numberTF;
        private JLabel label;
        private JButton okButton;
        private int num=0;

public void init(){

    Container c=getContentPane();
    setSize(500,500);

    label=new JLabel("Enter number");
    label.setLocation(200,40);
    label.setSize(100,30);

    numberTF=new JTextField(1);
    numberTF.setLocation(300,40);
    numberTF.setSize(100,30);

    okButton=new JButton();
	okButton.setText("OK");
    okButton.setLocation(400,40);
    okButton.setSize(100,30);
    okButton.addActionListener(this);

    c.setLayout(null);
    c.add(label);
    c.add(numberTF);
    c.add(okButton);
}

public void paint(Graphics g)
{
    super.paint(g);
    g.setColor(Color.blue);
    int inc=0,len=0;

for(int i=0;i <=num; i++)
{

g.drawOval(20+inc, 20+inc, 25+len, 25+len);

inc=inc+3;
len=len+5;
}
}
public void actionPerformed(ActionEvent e)
{
    num=Integer.parseInt(numberTF.getText());
    repaint();
}

public static void main(String args[])
{
    new DrawOvals();
}
}