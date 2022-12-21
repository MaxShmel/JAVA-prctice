package Practice2.Task8;

public class Reposition
{
    public static void main(String[] args)
    {
        String[] A;
        A = new String[5];
        A[0] = "cat";
        A[1] = "dog";
        A[2] = "log";
        A[3] = "god";
        A[4] = "dot";
        A = swapString(5, A);
        System.out.printf("%s %s %s %s %s", A[0],A[1],A[2],A[3],A[4]);
    }
    public static String[] swapString(int n,String[] a)
    {
        String x;
        for (int i = 0; i < (n/2); i++)
        {
            x = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = x;
        }
        return a;
    }
}
