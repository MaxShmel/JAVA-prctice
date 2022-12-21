package Practice1;
//import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        //Task 3
        System.out.println("Launching Task 3\n");
        int[] Array1 = {8, 495, 147, 85, 90};
        float Sum = 0;
        float Middle;
        System.out.println("Created array:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(" " + Array1[i]);
            Sum += Array1[i];
        }
        System.out.println("\nSum of numbers:");
        System.out.println(Sum);
        Middle = Sum / 2;
        System.out.println("\nAverage among these numbers:");
        System.out.println(Middle);
        System.out.println("\nTask3 completed\n");
    }
}







//1: 3,4,5,6
//2: 2,4,(5,6,7 на выбор),8,9,10
//3: Math 1-4; Классы: без таблицы; Строки: 1 из 3
//4: 1 или 2 и 3 или 4 на выбор (4.1: 2, 4, 10)
//5: все
//6: 4-11
//7:

