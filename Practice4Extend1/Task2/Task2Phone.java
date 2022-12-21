package Practice4Extend1.Task2;

public class Task2Phone
{
    private long number = 0000_000_00_00L;
    private short model = 1;
    private double weight = 70;

    public Task2Phone(long number, short model)
    {
        this.number=number;
        this.model=model;
    }

    public Task2Phone()
    {

    }

    public Task2Phone(long number, short model, double weight)
    {
        this(number,model);
        this.weight=weight;
    }

    public String toString()
    {
        return "Номер: "+this.number+" Модель: "+this.model+" Ширина: "+this.weight;
    }

    public String receiveCall(String name)
    {
        return "Звонит "+name;
    }

    public String receiveCall(String name,long number)
    {
        return "Звонит "+name+" ,Номер "+number;
    }

    public long getNumber()
    {
        return number;
    }

    public void sendMessage(int n, long[] number)
    {
        for(int i = 0; i < n; ++i)
        {
            System.out.println(number[i]);
        }
    }
}
