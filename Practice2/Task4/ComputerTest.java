package Practice2.Task4;

import Practice2.Task4.ComputerShop;

public class ComputerTest
{
    public static void main(String[] args)
    {
        ComputerShop A = new ComputerShop(2);
        A.Catalog();
        A.SearchCPU("I2");
        A.AddToShop();
        A.Catalog();
        A.SearchCPU("I2");
        A.RemoveFromShop(0);
        A.Catalog();
    }
}
