// 2. Write a java program that prints all real solutions to the quadratic equation
// ax2+bx+c=0. Read in a, b, c and use the quadratic formula.


import java.util.Scanner;

public class P2_RealQuad{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        System.out.println("Enter a,b,c for ax2+bx+c=0");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int d =  b*b - 4*a*c;

        if(d<0)
            System.out.println("Imaginary Solutions");
        if(d==0){
            System.out.println("Real and Equal Roots");
            r1 = r2 = -b/(2.0*a);
            System.out.println("The roots are "+r1+" and "+r2);
        }
        if(d>0){
            System.out.println("Roots are real and distinct");
            r1 = (-b+Math.sqrt(d))/(2.0*a);
            r2 = (-b-Math.sqrt(d))/(2.0*a);
            System.out.println("The roots are "+r1+" and "+r2);
        }


        sc.close();

    }
}