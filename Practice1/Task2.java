package Practice1;
import java.util.Scanner;
public class Task2
{
    public static void main (String[] args)
    {
        //Task 4
        System.out.println("Launching Task 4\n");
        Scanner scan = new Scanner (System.in);
        System.out.println("Input the number of elements in the array");
        int N = scan.nextInt();
        int[]Array = new int[N];
        int Sum = 0;
        int i = 0;
        System.out.println("Input " + N + " members of an array (Int type)");
        while (i < N)
        {
            Array[i] = scan.nextInt();
            Sum += Array[i];
            i++;
        }
        i = 0;
        int Max = -2147483648;
        int Min = 2147483647;
        System.out.print("Created array:");
        while (i < N)
        {
            if (Array[i] > Max)
            {
                Max = Array[i];
            }
            if (Array[i] < Min)
            {
                Min = Array[i];
            }
            System.out.print(" " + Array[i]);
            i++;
        }
        System.out.println("\nSum of elements = " + Sum);
        System.out.println("Maximum among elements = " + Max);
        System.out.println("Minimum among elements = " + Min);
    }
}
