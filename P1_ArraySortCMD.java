// 1. Read array of numbers through command line and sort in ascending order.
public class P1_ArraySortCMD
{
    public static void main(String[] args)
    {
        int [] arr = new int[10];
        System.out.println("Array Before Sorting: ");
        for(int i = 0; i<args.length; i++)
        {
            arr[i] = Integer.parseInt(args[i]);
            System.out.println(arr[i]);
        }
        System.out.println("Array After Sorting");
        
        for(int i = 0; i<args.length; i++)
        {
            for(int j = i+1; j<args.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i = 0; i<args.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}