// 7. Create a class as Student. Write a program in Java to display the names and roll
// numbers of students. Create an array of 10 students and initialize the array with
// user input. Handle ArrayIndexOutOfBoundsExeption, so that any such problem doesn’t
// cause illegal termination of program. Read a character from user and display the
// student names starting with given character.

import java.util.Scanner;

class student
{
    String name, rollno;
    student(String x, String y)
    {
        name = x;
        rollno = y;
    }
    void display()
    {
        System.out.println("Name: "+name+", Rollno: "+rollno);
    }
}

public class P7_Except
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        student[] s = new student[3];
        
        try
        {
            for(int i = 0; i<5; i++){
                System.out.println("Enter name and rollno. of student "+(i+1));    
                s[i] = new student(sc.next(), sc.next());
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

        try
        {
            System.out.println("Enter the charecter to search: ");
            char check = sc.next().charAt(0);
            for(int i = 0; i<5; i++){
                if(check == s[i].name.charAt(0))
                {
                    s[i].display();
                } 
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        sc.close();
    }
}