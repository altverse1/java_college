// 8. Write a java program on user defined exceptions. (For BankAccount)

class InsufficientFundsException extends Exception
{
    public InsufficientFundsException(String message)
    {
        super(message);
    }
}

class Account
{
    private int balance = 1000;
    public int balance()
    {
        return balance;
    }
    public void withdraw(int i) throws InsufficientFundsException
    {
        if(balance<i) 
        {
            throw new InsufficientFundsException("Exception While withdrawing: Amount to be withdrawed greater than Balance");
        }
        else
        {
            balance = balance-i;
        }
    }
    public void deposit(int i)
    {
        if(i<=0)
        {
            throw new IllegalArgumentException("Amount to be deposited is negative. Event will be reported.");
        }
        else
        {
            balance = balance+i;
        }
    }
}

public class P8_UserExcept {
    public static void main(String[] args)
    {
        Account acc = new Account();
        System.out.println("Current Balance: "+acc.balance());
        System.out.println("Witdrawing 1001");
        try{
            acc.withdraw(10001);
        }
        catch(InsufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Current Balance: "+acc.balance());
        System.out.println("Depositing -1");
        try
        {
            acc.deposit(-1);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
