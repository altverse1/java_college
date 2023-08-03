// 13. To simulate a Traffic Light. The program lets the user select one of three
// lights: red, yellow or Green with radio buttons. On selecting radio button, an
// appropriate message with “stop” or “Ready” or “GO” should appear above the button in
// selected color. Initially, there is no message Shown.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame implements ItemListener
{
    public JLabel l1, l2;
    public JRadioButton r1, r2, r3;
    public ButtonGroup bg;
    public JPanel p, p1;
    public A()
    {
        setLayout(new GridLayout(2,1));
        setSize(800, 800);
        p = new JPanel(new FlowLayout());
        p1 = new JPanel(new FlowLayout());
        l1 = new JLabel();
        Font f = new Font("Verdana", Font.BOLD, 60);
        l1.setFont(f);
        add(l1);
        p.add(l1);
        add(p);
        l2 = new JLabel("Set Light");
        p1.add(l2);
        r1 = new JRadioButton("Red");
        r1.setBackground(Color.RED);
        p1.add(r1);
        r2 = new JRadioButton("Green");
        r2.setBackground(Color.GREEN);
        p1.add(r2);
        r3 = new JRadioButton("Yellow");
        r3.setBackground(Color.YELLOW);
        p1.add(r3);
        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
        add(p1);
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent i)
    {
        JRadioButton jb = (JRadioButton) i.getSource();
        switch(jb.getText())
        {
            case "Red":{
                l1.setText("Stop");
                l1.setForeground(Color.RED);
            }
            break;
            case "Green":{
                l1.setText("Go");
                l1.setForeground(Color.GREEN);
            }
            break;
            case "Yellow":{
                l1.setText("Wait");
                l1.setForeground(Color.YELLOW);
            }
            break;
        }
    }

}

public class P13_Traffic {
    public static void main(String[] args)
    {
        new A();
    }
}
