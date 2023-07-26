// 7. Create a class as Student. Write a program in Java to display the names and roll
// numbers of students. Create an array of 10 students and initialize the array with
// user input. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t
// cause illegal termination of program. Read a character from user and display the
// student names starting with given character.

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
    void display()
    {
        System.out.println("The name is: "+this.name+"\nRoll no. is: "+this.rollno);
    }
}

public class P7_Except {
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Student[] s = new Student[2];
        try {
            for(int i = 0; i<6; i++)
            {
                System.out.println("Enter details of student "+(i+1));
                System.out.println("Enter the name and rollno of student: ");
                String name = s1.next();
                String rollno = s1.next();
                s[i] = new Student(name, rollno);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Enter first charecter: ");
        char check = s2.next().charAt(0);
        try
        {
            for(int i = 0; i<5; i++)
            {
                if(s[i].name.charAt(0) == check)
                {
                    s[i].display();
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        s1.close();
        s2.close();
    }
}
