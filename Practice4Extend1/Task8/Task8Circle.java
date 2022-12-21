package Practice4Extend1.Task8;

import Practice4Extend1.Task8.Task8Shape;

public class Task8Circle extends Task8Shape
{
    protected double radius;

    public Task8Circle()
    {

    }

    public Task8Circle(double radius)
    {
        this.radius = radius;
    }

    public Task8Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    double getArea()
    {
        return ((radius*3.14)*(radius*3.14));
    }

    double getPerimeter()
    {
        return (2*3.14*radius);
    }

    public String toString()
    {
        return super.toString()+" Радиус: "+this.radius+" Площадь: "+getArea()+" Периметр: "+getPerimeter();
    }
}
