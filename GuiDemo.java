import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GuiDemo
{
	JPanel panel;

	GuiDemo()
	{
		JLabel redLabel = new JLabel("Click to change color");
		JLabel blueLabel = 
                       new JLabel("Click to change color");
		JLabel backLabel = 
                       new JLabel("Click to change background color");

		final JButton redButton = new JButton("Red");
		redButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				redButton.setBackground(Color.RED);
			}
		});
		final JButton blueButton = new JButton("Blue");
		blueButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				blueButton.setBackground(Color.BLUE);
			}
		});
		final JButton backButton = new JButton("Background");
		backButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				panel.setBackground(Color.GREEN);
			}
		});

		panel = new JPanel();

		panel.add(redLabel);
		panel.add(redButton);
		
		panel.add(blueLabel);
		panel.add(blueButton);
		
		panel.add(backLabel);
		panel.add(backButton);
	}

	public static void main(String args[])
	{
		GuiDemo demo = new GuiDemo();
		JFrame frame = new JFrame("GUI Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setContentPane(demo.panel);
		frame.pack();
		frame.setVisible(true);
	}
}