package Practice4Extend1.Task8;

import Practice4Extend1.Task8.Task8Shape;

public class Task8Rectangle extends Task8Shape
{


    protected double length;
    protected double height;

    public Task8Rectangle()
    {

    }

    public Task8Rectangle(double length, double height)
    {
        this.length = length;
        this.height = height;
    }

    public Task8Rectangle(double length, double height, String color, boolean filled)
    {
        this.length = length;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getLength()
    {
        return length;
    }

    public double getHeight()
    {
        return height;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }


    double getArea()
    {
        return (height*length);
    }

    double getPerimeter()
    {
        return ((height+length)*2);
    }

    public String toString()
    {
        return super.toString()+" Высота: "+this.height+" Длина: "+this.length+" Площадь: "+getArea()+" Периметр: "+getPerimeter();
    }
}
