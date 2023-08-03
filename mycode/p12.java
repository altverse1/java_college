package practiceb;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Div extends JFrame implements ActionListener
{
	JTextField t1, t2, t3;
	JLabel l1, l2, l3;
	Div()
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		l1 = new JLabel("Num1");
		t1 = new JTextField(10);
		l2 = new JLabel("Num2");
		t2 = new JTextField(10);
		l3 = new JLabel("Result");
		t3 = new JTextField(10);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		JButton button = new JButton("Submit");
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			if(b==0)
				throw new ArithmeticException("Dumbass");
			float c = (float)a/b;
			t3.setText(String.valueOf(c));
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
		catch(NumberFormatException ex)
		{
			JOptionPane.showMessageDialog(this, ex.getMessage());
		}
	}
}

public class p12 {
	public static void main(String[] args)
	{
		new Div();
	}
}
