package Practice3.LineFormat.Task1;

import java.util.Scanner;

public class Task31Main
{
    public static void main(String[] args)
    {
        Task31Converter A = new Task31Converter();
        Scanner scanner = new Scanner(System.in);
        String Val1 = scanner.nextLine();
        String Val2 = scanner.nextLine();
        double Amount = scanner.nextDouble();
        System.out.println(A.getXtoY(Val1,Val2,Amount));
    }
}
