package practiceb;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class traffic extends JFrame implements ItemListener
{
	JPanel p1, p2;
	JLabel l1, l2;
	JRadioButton r1, r2, r3;
	ButtonGroup bg;
	traffic()
	{
		setLayout(new GridLayout(2,1));
		setSize(600,600);
		p1 = new JPanel();
		p2 = new JPanel();
		bg = new ButtonGroup();
		l1 = new JLabel();
		l1.setFont(new Font("Verdana", Font.BOLD, 60));
		l2 = new JLabel("Select: ");
		r1 = new JRadioButton("Red");
		r1.setBackground(Color.RED);
		r1.addItemListener(this);
		r2 = new JRadioButton("Yellow");
		r2.setBackground(Color.YELLOW);
		r2.addItemListener(this);
		r3 = new JRadioButton("Green");
		r3.setBackground(Color.GREEN);
		r3.addItemListener(this);
		p1.add(l1);
		p2.add(l2);
		p2.add(r1);
		p2.add(r2);
		p2.add(r3);
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		add(p1);
		add(p2);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent i)
	{
		JRadioButton jb = (JRadioButton) i.getSource();
		switch (jb.getText()) {
		case "Red":
		{
			l1.setText("STOP");
			l1.setForeground(Color.RED);
		}
			break;
			
		case "Green":
		{
			l1.setText("GO");
			l1.setForeground(Color.GREEN);
		}
			break;
			
		case "Yellow":
		{
			l1.setText("WAIT");
			l1.setForeground(Color.YELLOW);
		}
			break;
		}
	}
}

public class p13 {

	public static void main(String[] args) {
		new traffic();

	}

}
