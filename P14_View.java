// 14. Create a Swing that is having a List View to select the city, Text box to enter
// the name,phone number. Radio button to choose the gender and check box to choose
// hobbies. Create an alert to display the selections made by the user.

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


class A implements ActionListener
{
    JScrollPane jsp;
    JRadioButton rb1,rb2;
    JCheckBox c1, c2, c3, c4;
    JTextField t1, t2;
    String[] cities = {"City1", "City2", "City3", "City4", "City5", "City6", "City7", "City8", "City9", "City10"};
    JList<String> jList = new JList<String>(cities); 
    ArrayList<String> hobbies = new ArrayList<String>();
    A()
    {
        JFrame jf = new JFrame("Big Swing");
        jf.setSize(300, 300);
        jf.setLayout(new FlowLayout());
        
        JLabel l1 = new JLabel("Name");
        t1 = new JTextField(20);
        JLabel l2 = new JLabel("Number");
        t2 = new JTextField(20);
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);

        jsp = new JScrollPane(jList);
        jsp.setPreferredSize(new Dimension(100, 100));
        jf.add(jsp);

        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");
        ButtonGroup rbg = new ButtonGroup();
        rbg.add(rb1);
        rbg.add(rb2);
        jf.add(rb1);
        jf.add(rb2);

        c1 = new JCheckBox("Swmming");
        c2 = new JCheckBox("Running");
        c3 = new JCheckBox("Tennis");
        c4 = new JCheckBox("Reading");

        jf.add(c1);
        jf.add(c2);
        jf.add(c3);
        jf.add(c4);

        JButton jb = new JButton("Submit");
        jb.addActionListener(this);

        jf.add(jb);

        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String val = e.getActionCommand();
        String city, name, num, gender;
        if(val.equals("Submit"))
        {
            city = jList.getSelectedValue();
            name = t1.getText();
            num = t2.getText();
            if(rb1.isSelected())
                gender = rb1.getActionCommand();
            else
                gender = rb1.getActionCommand();
            if(c1.isSelected())
                hobbies.add(c1.getActionCommand());
            if(c2.isSelected())
                hobbies.add(c2.getActionCommand());
            if(c3.isSelected())
                hobbies.add(c3.getActionCommand());
            if(c4.isSelected())
                hobbies.add(c4.getActionCommand());
            String res = "Name: "+name+"\nCity: "+city+"\nNumber:"+num+"\nGender: "+gender+"\nHobbies:\n";
            for (String s : hobbies) res += s +"\n";       
            JOptionPane.showMessageDialog(null, res);
            hobbies.clear();
            
        }

    }
}


public class P14_View {
    public static void main(String[] args)
    {
        new A();
    }
}
