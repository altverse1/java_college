// 6. Design a class called Student having data members like student name and roll
// number and method called show to display the name and roll number. Derive a class
// called Test from student class having three subjects’ marks as a data members and
// method named show_marks to display the marks. Create an interface called Sports
// contains constant sports marks and method show_sportswt. Derive a class Result from
// Test class and implement the interface Sports .Calculate total marks by considering
// sports marks. Then display the total in Result class.

import java.util.Scanner;

class student
{
    String name, rollno;
    student(String a, String b)
    {
        name = a;
        rollno = b;
    }
    void show()
    {
        System.out.println("Name: "+name+"\nRollno: "+rollno);
    }
}

class test extends student
{
    int a; 
    int b; 
    int c;
    test(String x, String y, int a, int b, int c)
    {
        super(x,y);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void show_marks()
    {
        System.out.println("Sub1: "+a+"\nSub2: "+b+"\nSub3: "+c);
    }
}
interface sports
{
    int sports_marks = 40;
    public void show_sportswt();
}

class result extends test implements sports
{
    int total_marks;
    public void show_sportswt()
    {
        System.out.println("Sports Marks: "+sports_marks);
    }
    result(String x, String y, int a, int b, int c)
    {
        super(x,y,a,b,c);
    }
    void display()
    {
        show_marks();
        System.out.println("Total Marks: "+(a+b+c+sports_marks));
    }
}

public class P6_Interface
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        result r = new result(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        r.display();
        sc.close();
    }
}