//Written by Autumn Neil.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PizzaShop extends JFrame implements ItemListener,ActionListener{

private JRadioButton smallRb,mediumRb,largeRb; 
private JRadioButton thinCrustRb,mediumCrustRb,panRb;
private ButtonGroup pizzaSize,pizzaType;
private JCheckBox tomato,greenPepper,blackOlives, mushrooms,extraCheese,pepperoni,sausage;
private JButton processSelection;
private JLabel topLabel,sizeLabel,typeLabel;
private JTextArea billTA;
private static String pType="",pSize="",toppings="";
private static double amount=0;

public PizzaShop(){

setTitle("Pizza Shop");

Container c=getContentPane();
c.setLayout(null);
setSize(520,550);

topLabel=new JLabel("Each Toppings: $1.50");
topLabel.setForeground(Color.RED);
topLabel.setSize(150,30);
topLabel.setLocation(30,70);

c.add(topLabel);
sizeLabel=new JLabel("Pizza Size");
sizeLabel.setForeground(Color.RED);
sizeLabel.setSize(120,30);
sizeLabel.setLocation(190,70);

typeLabel=new JLabel("Pizza Type");
typeLabel.setForeground(Color.RED);
typeLabel.setSize(120,30);
typeLabel.setLocation(360,70);

c.add(typeLabel);
c.add(sizeLabel);

tomato=new JCheckBox("Tomato");
tomato.setSize(120,30);
tomato.setLocation(40,100);

greenPepper=new JCheckBox("Green Pepper");
greenPepper.setSize(120,30);
greenPepper.setLocation(40,130);

blackOlives=new JCheckBox("Black Olives");
blackOlives.setSize(120,30);
blackOlives.setLocation(40,160);

mushrooms=new JCheckBox("Mushrooms");
mushrooms.setSize(120,30);
mushrooms.setLocation(40,190);

extraCheese=new JCheckBox("Extra Cheese");
extraCheese.setSize(120,30);
extraCheese.setLocation(40,220);

pepperoni=new JCheckBox("Pepperoni");
pepperoni.setSize(120,30);
pepperoni.setLocation(40,250);

sausage=new JCheckBox("Sausage");
sausage.setSize(120,30);
sausage.setLocation(40,280);

smallRb=new JRadioButton("Small: $6.50");
smallRb.setSize(120,30);
smallRb.setLocation(200,100);

mediumRb=new JRadioButton("Medium: $8.50");
mediumRb.setSize(120,30);
mediumRb.setLocation(200,140);

largeRb=new JRadioButton("Large: $10.00");
largeRb.setSize(120,30);
largeRb.setLocation(200,180);

thinCrustRb=new JRadioButton("Thin Crust");
thinCrustRb.setSize(110,30);
thinCrustRb.setLocation(380,100);

mediumCrustRb=new JRadioButton("Medium Crust");
mediumCrustRb.setSize(110,30);
mediumCrustRb.setLocation(380,140);

panRb=new JRadioButton("Pan");
panRb.setSize(110,30);
panRb.setLocation(380,180);

pizzaSize=new ButtonGroup();
pizzaSize.add(smallRb);
pizzaSize.add(mediumRb);
pizzaSize.add(largeRb);

pizzaType=new ButtonGroup();
pizzaType.add(thinCrustRb);
pizzaType.add(mediumCrustRb);
pizzaType.add(panRb);

smallRb.addItemListener(this);
mediumRb.addItemListener(this);
largeRb.addItemListener(this);
thinCrustRb.addItemListener(this);
mediumCrustRb.addItemListener(this);
panRb.addItemListener(this);
largeRb.addItemListener(this);
tomato.addItemListener(this);
greenPepper.addItemListener(this);
blackOlives.addItemListener(this);
mushrooms.addItemListener(this);
extraCheese.addItemListener(this);
pepperoni.addItemListener(this);
sausage.addItemListener(this);

processSelection=new JButton("Process Selection" );
processSelection.setSize(200,30);
processSelection.setLocation(200,240);

processSelection.addActionListener(this);

billTA=new JTextArea();
billTA.setFont(new Font("Courier",Font. BOLD,14 ));
billTA.setForeground(Color.BLACK);
billTA.setSize(450,100);
billTA.setLocation(20,350);

c.add(billTA);
c.add(tomato);
c.add(greenPepper);
c.add(blackOlives);
c.add(mushrooms);
c.add(extraCheese);
c.add(pepperoni);
c.add(sausage);
c.add(smallRb);
c.add(mediumRb);
c.add(largeRb);
c.add(thinCrustRb);
c.add(mediumCrustRb);
c.add(panRb);
c.add(processSelection);

setVisible(true);

setDefaultCloseOperation(EXIT_ON_CLOSE);
}

private void displayBill()
{

billTA.setEditable(false);
billTA.setText("");
billTA.append("Your Order:\n ");
billTA.append("Pizza Type:\t"+pType+"\n");
billTA.append("Pizza Size:\t"+pSize+"\n");
billTA.append("Toppings:\t"+toppings+"\n");
billTA.append("Amount Due:\t$ "+amount);

repaint();

}

public void paint(Graphics g)
{

super.paint(g);

g.setColor(Color.red);
g.drawRect(30, 100, 140, 240);
g.drawRect(190, 100, 140, 150);
g.drawRect(355, 100, 150, 150);
g.setFont(new Font("Arial",Font.BOLD,24));

g.drawString("Welcome to Home Style Pizza Shop", 40, 80);
}

public void itemStateChanged(ItemEvent e)
{

if(e.getSource()==smallRb)
{
pSize="Small";
amount=6.50;

if(tomato.isSelected()==true)
amount=amount+1.50;

if(greenPepper.isSelected()==true)
amount=amount+1.50;

if(mushrooms.isSelected()==true)
amount=amount+1.50;

if(blackOlives.isSelected()==true)
amount=amount+1.50;

if(extraCheese.isSelected()==true)
amount=amount+1.50;

if(pepperoni.isSelected()==true)
amount=amount+1.50;

if(sausage.isSelected()==true)
amount=amount+1.50;
}

else if(e.getSource()==mediumRb)
{

pSize="Medium";
amount=8.50;

if(tomato.isSelected()==true)
amount=amount+1.50;

if(greenPepper.isSelected()==true)
amount=amount+1.50;

if(mushrooms.isSelected()==true)
amount=amount+1.50;

if(blackOlives.isSelected()==true)
amount=amount+1.50;

if(extraCheese.isSelected()==true)
amount=amount+1.50;

if(pepperoni.isSelected()==true)
amount=amount+1.50;

if(sausage.isSelected()==true)
amount=amount+1.50;
}

else if(e.getSource()==largeRb)
{

pSize="Large";
amount=10.00;

if(tomato.isSelected()==true)
amount=amount+1.50;

if(greenPepper.isSelected()==true)
amount=amount+1.50;

if(mushrooms.isSelected()==true)
amount=amount+1.50;

if(blackOlives.isSelected()==true)
amount=amount+1.50;

if(extraCheese.isSelected()==true)
amount=amount+1.50;

if(pepperoni.isSelected()==true)
amount=amount+1.50;

if(sausage.isSelected()==true)
amount=amount+1.50;
}

if(e.getSource()==thinCrustRb)

pType="Thin Crust";

else if(e.getSource()==mediumCrustRb)

pType="Medium Crust";

else if(e.getSource()==panRb)

pType="Pan";

if(e.getSource()==tomato)
{

if(e.getStateChange()==ItemEvent.SELECTED)
{

amount=amount+1.50;
toppings=toppings.concat("Tomato,");
}

else if(e.getStateChange()== ItemEvent. DESELECTED)
{

amount=amount-1.50;

if(toppings.contains("Tomato"))
toppings=toppings.replace("Tomato,","");
}
}

if(e.getSource()==greenPepper)
{

if(e.getStateChange()==ItemEvent.SELECTED)
{

amount=amount+1.50;
toppings=toppings.concat("Green Pepper,");
}

else if(e.getStateChange()==ItemEvent. DESELECTED)
{

amount=amount-1.50;

if(toppings.contains("Green Pepper"))

toppings=toppings.replace("Green Pepper,","");
}
}

if(e.getSource()==blackOlives)
{

if(e.getStateChange()==ItemEvent.SELECTED)
{

amount=amount+1.50;
toppings=toppings.concat("Black Olives,");
}

else if(e.getStateChange()==ItemEvent. DESELECTED)
{

amount=amount-1.50;

if(toppings.contains("Black Olives"))

toppings=toppings.replace ("Black Olives,","");
}
}

if(e.getSource()==mushrooms)
{

if(e.getStateChange()==ItemEvent.SELECTED)
{

amount=amount+1.50;
toppings=toppings.concat("Mushrooms,");
}

else if(e.getStateChange()==ItemEvent. DESELECTED)
{

amount=amount-1.50;

if(toppings.contains("Mushrooms"))

toppings=toppings.replace ("Mushrooms,","");
}
}

if(e.getSource()==extraCheese)
{

if(e.getStateChange()==ItemEvent.SELECTED)
{

amount=amount+1.50;
toppings=toppings.concat ("Extra Cheese,");
}

else if(e.getStateChange()==ItemEvent. DESELECTED)
{

amount=amount-1.50;
toppings=toppings.replace("Extra Cheese,","");
}
}

if(e.getSource()==pepperoni)
{

if(e.getStateChange()==ItemEvent.SELECTED)
{

amount=amount+1.50;
toppings=toppings.concat("Pepperoni,");
}

else if(e.getStateChange()==ItemEvent. DESELECTED)
{

amount=amount-1.50;

if(toppings.contains("Pepperoni"))

toppings=toppings.replace("Pepperoni,","");
}
}

if(e.getSource()==sausage)
{

if(e.getStateChange()==ItemEvent.SELECTED)
{

amount=amount+1.50;
toppings=toppings.concat("Sausage,");
}

else if(e.getStateChange()==ItemEvent. DESELECTED)
{

amount=amount-1.50;

if(toppings.contains("Sausage"))

toppings=toppings.replace("Sausage,", "");
}
}

repaint();
}

public void actionPerformed(ActionEvent e){

if(e.getActionCommand().equals("Process Selection"))
{
	
displayBill();
}
}

public static void main(String[] args){

PizzaShop ps=new PizzaShop();
}
}