package Practice3.LineFormat.Task1;

public class Task31Converter
{
    private double RUR = 60.48;
    private double EUR = 0.96;
    private double GBR = 0.82;

    public Task31Converter()
    {

    }

    public String getXtoY(String x,String y, double Amount)
    {
        double firstVal = 0;
        double secondVal = 0;

        if (x.equals("EUR"))
        {
            firstVal = EUR;
        }
        else if (x.equals("RUR"))
        {
            firstVal = RUR;
        }
        else if(x.equals("GBR"))
        {
            firstVal = GBR;
        }
        else if (x.equals("USD"))
        {
            firstVal = 1;
        }

        if (y.equals("EUR"))
        {
            secondVal = EUR;
        }
        else if (y.equals("RUR"))
        {
            secondVal = RUR;
        }
        else if(y.equals("GBR"))
        {
            secondVal = GBR;
        }
        else if (y.equals("USD"))
        {
            secondVal = 1;
        }

        String ret;

        if (firstVal != 0 && secondVal != 0)
        {
            double rawAmount = Amount/firstVal;
            double buyPrice = rawAmount * secondVal;
            double sellPrice = buyPrice * 0.89;
            ret = "Покупка: "+buyPrice+"\nПродажа: "+sellPrice;
        }
        else
        {
            ret = "Валюта не определенна!";
        }

        return ret;
    }
}
