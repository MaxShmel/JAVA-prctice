package Practice2.Task2;
import Practice2.Task2.Ball;

import java.util.Scanner;
public class BallTest
{
    public static void main(String[] args)
    {
        Ball B = new Ball();
        Scanner scan = new Scanner(System.in);
        System.out.println(B.toString());
        System.out.print("Input x: ");
        B.setX(scan.nextDouble());
        System.out.printf("Input y: ");
        B.setY(scan.nextDouble());
        System.out.printf("x: %s%ny: %s",B.getX(),B.getY());
    }
}
