// 4. Write a java program to implement method overriding.
class modemo
{
    int i, j;
    modemo(int a, int b)
    {
        i = a;
        j = b;
    }
    void show()
    {
        System.out.println("i and j are: "+i+ " , "+j);
    }
}

class B extends modemo
{
    int k;
    B(int a, int b, int c)
    {
        super(a,b);
        k = c;
    }
    void show()
    {
        super.show();
        System.out.println("k: "+k);
    }
}

public class P4_MehodOverride {
    public static void main(String[] args)
    {
        B ele = new B(1,2,3);
        ele.show();
    }
    
}
