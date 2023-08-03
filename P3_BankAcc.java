// 3. Design a class to represent a bank account. Which contains account number, name
// of the depositor, type of the account, balance amount in the account. Use
// constructor to assign initial values, use member functions to Deposit an amount, to
// Withdraw amount after checking balance, to display name and balance.

import java.util.Scanner;

class BankAccount
{
    String accno, name, type;
    int balance;
    BankAccount(String accno, String name, String type, int balance)
    {
        this.accno = accno;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }
    void deposit(int i)
    {
        if(i>0)
        {
            System.out.println("Money Depositied.");
            balance = balance+i;
        }
    }
    void withdraw(int i)
    {
        if(i>0 && balance-i>0)
        {
            System.out.println("Money Withdrawn.");
            balance = balance-i;
        }
    }
    void display()
    {
        System.out.println("Name: "+name+"\nBalance: "+balance);
    }

}

public class P3_BankAcc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount(sc.next(), sc.next(), sc.next(), sc.nextInt());
        b.withdraw(200);
        b.deposit(200);
        b.display();
        sc.close();
    }
}