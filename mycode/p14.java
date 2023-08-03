package practiceb;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

class inters extends JFrame implements ActionListener
{
	JScrollPane jsp;
	JRadioButton r1, r2;
	JTextField t1,t2;
	JCheckBox c1,c2,c3,c4;
	String[] city = {"City1", "City2", "City3", "City4", "City6"};
	JList<String> jList = new JList<String>(city);
	ArrayList<String>hobby = new ArrayList<String>();
	inters()
	{
		setLayout(new FlowLayout());
		setSize(300,300);
		JLabel l1 = new JLabel("Name: ");
		JLabel l2 = new JLabel("Phone: ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		c1 = new JCheckBox("Dance");
		c2 = new JCheckBox("Youtuber");
		c3 = new JCheckBox("Music");
		c4 = new JCheckBox("Actor");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		jsp = new JScrollPane(jList);
		jsp.setPreferredSize(new Dimension(100,100));
		

		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(r1);
		bGroup.add(r2);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(jsp);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		
		
		JButton button = new JButton("Submit");
		button.addActionListener(this);
		add(button);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String valString = ae.getActionCommand();
		String city, name, num, gender;
		if(valString.equals("Submit"))
		{
			city = jList.getSelectedValue();
			name = t1.getText();
			num = t2.getText();
			if(r1.isSelected())
				gender = r1.getActionCommand();
			else
				gender = r2.getActionCommand();
			
			if(c1.isSelected())
				hobby.add(c1.getActionCommand());
			if(c2.isSelected())
				hobby.add(c2.getActionCommand());
			if(c3.isSelected())
				hobby.add(c3.getActionCommand());
			if(c4.isSelected())
				hobby.add(c4.getActionCommand());
			
			String reString = "Name: "+name+"\nPhone: "+num+"\nCity: "+city+"\nGender: "+gender+"\nHobbies: \n";
			for (String s : hobby) reString+= "-> "+s+"\n";
			JOptionPane.showMessageDialog(null, reString);
			hobby.clear();
		}
	}
}

public class p14 {

	public static void main(String[] args) {
		new inters();
	}

}
