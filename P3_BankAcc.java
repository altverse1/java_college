// 3. Design a class to represent a bank account. Which contains account number, name
// of the depositor, type of the account, balance amount in the account. Use
// constructor to assign initial values, use member functions to Deposit an amount, to
// Withdraw amount after checking balance, to display name and balance.

import java.util.Scanner;

class BankAccount
{
    int bankno; 
    String name, type; 
    int bankbal;
    BankAccount()
    {
        System.out.println("\n---------Def. Constructor is called---------\n");
    }
    BankAccount(int no, String name, String type, int money )
    {
        bankno = no;
        this.name = name;
        this.type = type;
        bankbal = money;
    }
    void deposit(int money)
    {
        this.bankbal = this.bankbal+money;
        System.out.println("\n---------Deposit of "+money+" Money Success---------");
    }
    void withdraw(int money)
    {
        if((this.bankbal-money)<0 || money<=0)
            System.out.println("\n---------Withdraw impossible---------\n");
        else
        {
            this.bankbal = this.bankbal-money;
            System.out.println("\n---------Withdrawl Success---------\n");
    
        }
    }
        void display()
    {
        System.out.println("Information:\nName: "+this.name+"\nBalance: "+this.bankbal);
    }
}

public class P3_BankAcc {
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount();//Calling Default Constructor
        b = null; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Acc.no, Name, Type of Acc and Initial Balance.");
        BankAccount ba = new BankAccount(sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        System.out.println("Enter Money to deposit: "); 
        ba.deposit(sc.nextInt());
        System.out.println("Enter money to withdraw");
        ba.withdraw(sc.nextInt());
        ba.display();
        sc.close();
    }
}
