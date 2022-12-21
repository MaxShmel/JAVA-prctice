package Practice2.Task10;
import java.util.Scanner;

public class HowMany
{
    public static void main(String[] args)
    {
        System.out.print("Для прекращения ввода слов введите 'End': ");
        String input;
        String Line = "";
        Scanner scanner = new Scanner(System.in);
        do
        {
            input = scanner.nextLine();
            if ((input.equals("End")))
            {

            }
            else
            {
                Line+=input;
                Line+=" ";
            }
        }
        while (!(input.equals("End")));
        int n = 0;
        for (int i = 0; i < Line.length(); ++i)
        {
            if(' ' == Line.charAt(i))
            {
                n++;
            }
        }
        System.out.println(n);
    }
}

