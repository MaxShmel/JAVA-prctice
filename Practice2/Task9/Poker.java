package Practice2.Task9;
import java.util.Scanner;

public class Poker
{
    public static void main(String[] args)
    {
//        String[] suits = {"Пик","Бубен","Червь","Треф"};
//        String[] rank = {"2","3","4","5","6","7","8","9","10","Валет","Королева","Король","Туз"};
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String c = "";
//        int x;
//        for (int i = 0; i < n; ++i)
//        {
//            c = "";
//            for (int j = 0; j < 5; ++j)
//            {
//                x = (int)(Math.random()*(12-0));
//                c+=rank[x];
//                c+=" ";
//                x = (int)(Math.random()*(3-0));
//                c+=suits[x];
//                c+=" ; ";
//            }
//            System.out.println(c);
//        }
        int Size = 52;
        String[] rank = new String[Size];
        {
            rank[0] = "2 Пик";
            rank[1] = "3 Пик";
            rank[2] = "4 Пик";
            rank[3] = "5 Пик";
            rank[4] = "6 Пик";
            rank[5] = "7 Пик";
            rank[6] = "8 Пик";
            rank[7] = "9 Пик";
            rank[8] = "10 Пик";
            rank[9] = "Валет Пик";
            rank[10] = "Королева Пик";
            rank[11] = "Король Пик";
            rank[12] = "Туз Пик";

            rank[13] = "2 Бубен";
            rank[14] = "3 Бубен";
            rank[15] = "4 Бубен";
            rank[16] = "5 Бубен";
            rank[17] = "6 Бубен";
            rank[18] = "7 Бубен";
            rank[19] = "8 Бубен";
            rank[20] = "9 Бубен";
            rank[21] = "10 Бубен";
            rank[22] = "Валет Бубен";
            rank[23] = "Королева Бубен";
            rank[24] = "Король Бубен";
            rank[25] = "Туз Бубен";

            rank[26] = "2 Червь";
            rank[27] = "3 Червь";
            rank[28] = "4 Червь";
            rank[29] = "5 Червь";
            rank[30] = "6 Червь";
            rank[31] = "7 Червь";
            rank[32] = "8 Червь";
            rank[33] = "9 Червь";
            rank[34] = "10 Червь";
            rank[35] = "Валет Червь";
            rank[36] = "Королева Червь";
            rank[37] = "Король Червь";
            rank[38] = "Туз Червь";

            rank[39] = "2 Треф";
            rank[40] = "3 Треф";
            rank[41] = "4 Треф";
            rank[42] = "5 Треф";
            rank[43] = "6 Треф";
            rank[44] = "7 Треф";
            rank[45] = "8 Треф";
            rank[46] = "9 Треф";
            rank[47] = "10 Треф";
            rank[48] = "Валет Треф";
            rank[49] = "Королева Треф";
            rank[50] = "Король Треф";
            rank[51] = "Туз Треф";
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String c = "";
        int x;
        for (int i = 0; i < n; ++i)
        {
            c = "";
            for (int j = 0; j < 5; ++j)
            {
                x = (int)(Math.random()*(Size));
                c+=rank[x];
                c+=" ; ";
                String[] buffer = new String[Size-1];
                for (int k = 0; k < x; k++)
                {
                    buffer[k] = rank[k];
                }
                for (int k = x; k < Size-1; k++)
                {
                    buffer[k] = rank[k+1];
                }
                Size--;
                rank = buffer;
            }
            System.out.println(c);
        }
    }
}
