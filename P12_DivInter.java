// 12. To create User Interface to perform Integer Divison. The user enters two numbers
// in text fields, Num1 and Num2.The division of Num1 and Num2 is displayed in the
// result field when the divide button clicked. If Num1 or Num2 were not integer, the
// program would throw a NumberFormatException, If Num2 is Zero, the program would
// throw an Arithmetic Exception. Display the Exception in message box.



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class A extends JFrame implements ActionListener
{
    JLabel l1, l2 ,l3;
    JTextField t1, t2, t3;
    JButton b1;
    A()
    {
        setLayout(new FlowLayout());
        setSize(600, 400);
        l1 = new JLabel("Enter number 1");
        l2 = new JLabel("Enter number 2");
        l3 = new JLabel("Result");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        b1 = new JButton("Divide");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        b1.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            if(b==0)
                throw new ArithmeticException("Divide by zero error");
            float c = (float) a/b;
            t3.setText(String.valueOf(c));
        }
        catch(ArithmeticException aex)
        {
            JOptionPane.showMessageDialog(this, aex.getMessage());
        }
        catch(NumberFormatException nex)
        {
            JOptionPane.showMessageDialog(this, nex.getMessage());
        }
    }
}


public class P12_DivInter {
    public static void main(String[] args)
    {
        new A();
    }
}
