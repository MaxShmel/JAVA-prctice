package Practice4Extend1.Task8;

public class Task8Tester
{
    public static void main(String[] args)
    {
        Task8Circle Circ1 = new Task8Circle(5, "Red",true);
        System.out.println(Circ1.getRadius());
        System.out.println(Circ1.getArea());
        System.out.println(Circ1.getPerimeter());
        System.out.println(Circ1.toString());

        Task8Rectangle Rect1 = new Task8Rectangle(5, 10, "Red",true);
        System.out.println(Rect1.toString());

        Task8Square Square1 = new Task8Square(10, "Red",true);
        System.out.println(Square1.toString());
    }
}
