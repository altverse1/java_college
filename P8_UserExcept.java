// 8. Write a java program on user defined exceptions. (For BankAccount)

class UserDefinedWithdrawException extends Exception
{
    public UserDefinedWithdrawException(String e)
    {
        super(e);
    }
}

class BankAccount
{
    private int balance = 200;
    void deposit(int i)
    {
        if(i<0)
        {
            throw new IllegalArgumentException("Cant have negative value as deposit amt.");
        }
        else
        {
            balance = balance + i;
        }
    }
    void withdraw(int i) throws UserDefinedWithdrawException
    {
        if(balance<i)
        {
            throw new UserDefinedWithdrawException("Cant Do This. Minimum Balance Must Be Maintained.");
        }
        else
        {
            balance = balance - i;
        }
    }
}
public class P8_UserExcept
{
    public static void main(String[] args)
    {
        System.out.println("Withdrawing 69420");
        BankAccount b = new BankAccount();
        try
        {
            b.withdraw(69420);
        }
        catch(UserDefinedWithdrawException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Depositing Negative Amount");
        try
        {
            b.deposit(-1);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}