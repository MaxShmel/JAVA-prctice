package Practice4Extend1.Task8;

public abstract class Task8Shape
{
    protected String color;
    protected boolean filled;

    public Task8Shape()
    {

    }

    public Task8Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String toString()
    {
        return "Цвет: "+this.color+" Заполнен: "+this.filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean getFilling()
    {
        return filled;
    }

    public void setFilling(boolean filled)
    {
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();


}
