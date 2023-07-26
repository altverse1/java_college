// 6. Design a class called Student having data members like student name and roll
// number and method called show to display the name and roll number. Derive a class
// called Test from student class having three subjects’ marks as a data members and
// method named show_marks to display the marks. Create an interface called Sports
// contains constant sports marks and method show_sportswt. Derive a class Result from
// Test class and implement the interface Sports .Calculate total marks by considering
// sports marks. Then display the total in Result class.

import java.util.Scanner;

class Student
{
    String name;
    String rollno;
    Student(String name, String rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }
    void show()
    {
        System.out.println("The name is: "+name+"\n The roll.no is: "+rollno);
    }
}

class Test extends Student
{
    int sub1;
    int sub2;
    int sub3;
    Test(String name, String rollno, int a, int b, int c)
    {
        super(name, rollno);
        sub1 = a;
        sub2 = b;
        sub3 = c;
    }
    void show_marks()
    {
        super.show();
        System.out.println("Sub1: "+sub1+"\nSub2: "+sub2+"\nSub3: "+sub3);
    }    
}

interface sports
{
    final int sports_marks = 40;
    void show_sportswt();
}

class Result extends Test implements sports
{
    int total_marks = sub1+sub2+sub3+sports_marks;
    public void show_sportswt()
    {
        System.out.println("The Final Sports Mark is: "+sports_marks);
    }
    Result(String name, String rollno, int a, int b, int c)
    {
        super(name, rollno, a, b, c);
    }
    void display()
    {
        super.show_marks();
        System.out.println("Total Marks: "+total_marks);
    }
}


public class P6_Interface {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, rollno, and Marks in 3 subjects: ");
        Result r = new Result(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        r.display();
        r.show_sportswt();
        sc.close();
    }
}
