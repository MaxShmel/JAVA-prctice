package Practice4Extend1.Task8;

import Practice4Extend1.Task8.Task8Rectangle;

public class Task8Square extends Task8Rectangle
{
    public Task8Square()
    {

    }

    public Task8Square(double side)
    {
        this.length = side;
    }

    public Task8Square(double side, String color, boolean filled)
    {
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide()
    {
        return length;
    }

    public void setLength(double side)
    {
        this.length = side;
    }

    double getArea()
    {
        return (length*length);
    }

    double getPerimeter()
    {
        return (length*4);
    }

    public String toString()
    {
        return "Цвет: "+this.color+" Заполнен: "+this.filled+" Сторона: "+this.length+" Площадь: "+getArea()+" Периметр: "+getPerimeter();
    }
}
