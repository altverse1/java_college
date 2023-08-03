// 2. Write a java program that prints all real solutions to the quadratic equation
// ax2+bx+c=0. Read in a, b, c and use the quadratic formula.

import java.util.Scanner;

public class P2_RealQuad
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        double x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c for ax2+bx+c=0");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = (b*b-(4*a*c));

        if(d==0)
        {
            x1 = x2 = -b/(2*a);
            System.out.println("Equal & Real Roots, they are: "+x1);
        }
        if(d>0)
        {
            x1 = (-b+Math.sqrt(d))/(2*a);
            x2 = (-b-Math.sqrt(d))/(2*a); 
            System.out.println("Real, Distinct Roots, they are: "+x1+" & "+x2);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
        sc.close();
    }
}