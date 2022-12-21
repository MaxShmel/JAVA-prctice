package Practice4Extend1.Task4;

import Practice4Extend1.Task4.Task4Matrix;

public class Task4Main
{
    public static void main(String[] args)
    {
        Task4Matrix A = new Task4Matrix(3,3);
        Task4Matrix B = new Task4Matrix(3,3);
        System.out.println(A.toString());
        System.out.println(B.toString());
        A.PlusMatrix(B);
        System.out.println(A.toString());
        A.Multiplication(3);
        System.out.println(A.toString());
    }
}
