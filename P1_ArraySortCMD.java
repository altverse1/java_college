// 1. Read array of numbers through command line and sort in ascending order.

public class P1_ArraySortCMD {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i = 0; i<args.length; i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Array Before Sorting:");
        for(int i = 0; i<args.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        for(int i = 0; i<args.length; i++)
        {
            for(int j = i+1; j<args.length; j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nThe array after sorting is:");
        for(int i = 0; i<args.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
