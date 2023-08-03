// 4. Write a java program to implement method overriding.

class override
{
    int i,j;
    override(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
    void show()
    {
        System.out.println("i: "+i+", j: "+j);
    }
}

class B extends override
{
    int k;
    B(int i, int j, int k)
    {
        super(i,j);
        this.k = k;
    }
    void show()
    {
        super.show();
        System.out.println("k is "+k);
    }
}

public class P4_MehodOverride
{
    public static void main(String[] args)
    {
        B b = new B(1,2,3);
        b.show();
    }
}