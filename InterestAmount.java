package Assignment2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class InterestAmount extends JFrame
{
		InterestAmount()
{
	JLabel lab1=new JLabel("Principal:");
	final JTextField text1=new JTextField(20);
	JLabel lab2=new JLabel("ROI is:");
	final JTextField text2= new JTextField(20);
	JLabel lab3=new JLabel("NO. OF Months:");
	final JTextField text3=new JTextField(20);
	JButton b=new JButton("Get");
	b.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
{
	double p=Double.parseDouble(text1.getText());
	double r=Double.parseDouble(text2.getText())/100;
	double t=Double.parseDouble(text3.getText())/12;
	double interest=p*r*t;
	JOptionPane.showMessageDialog(null, "Total Interest: "+interest); 
}
});
	setLayout(null);
	lab1.setBounds(10,10,100,20);
	text1.setBounds(150,10,200,20);
	lab2.setBounds(10,40,100,20);
	text2.setBounds(150,40,200,20);
	lab3.setBounds(10,70,120,20);
	text3.setBounds(150,70,200,20);
	b.setBounds(150,110,70,20);
	add(lab1);
	add(text1);
	add(lab2);
	add(text2);
	add(lab3);
	add(text3);
	add(b);
	setVisible(true);
	setSize(400,200);
}
	public static void main(String[] args) 
{
	new InterestAmount();
}
}


