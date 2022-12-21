package Practice2.Task4;
import Practice2.Task4.Computer;

import java.util.Scanner;

public class ComputerShop
{
    private Computer[] list;
    private int Amount;

    public ComputerShop(int Amount)
    {
        if (Amount < 1)
        {
            Amount = 1;
        }
        this.Amount = Amount;
        list = new Computer[this.Amount];
        Scanner scan = new Scanner(System.in);
        String CPU;
        String GPU;
        int RAM;
        int ROM;
        for (int i = 0; i < this.Amount; i++)
        {
            System.out.printf("Input CPU series number: ",i);
            CPU = scan.nextLine();
            System.out.printf("Input GPU series number: ",i);
            GPU = scan.nextLine();
            System.out.printf("Input the RAM capacity: ",i);
            RAM = scan.nextInt();
            System.out.printf("Input the ROM capacity: ",i);
            ROM = scan.nextInt();
            scan.nextLine();
            list[i] = new Computer(CPU,GPU,RAM,ROM);
        }
        System.out.println("Product entry creation complete!");
    }

    public void AddToShop()
    {
        Scanner scan = new Scanner(System.in);
        Amount++;
        System.out.printf("\nInput CPU series number: ",this.Amount-1);
        String CPU = scan.nextLine();
        System.out.printf("Input GPU series number: ",this.Amount-1);
        String GPU = scan.nextLine();
        System.out.printf("Input the RAM capacity: ",this.Amount-1);
        int RAM = scan.nextInt();
        System.out.printf("Input the ROM capacity: ",this.Amount-1);
        int ROM = scan.nextInt();
        scan.nextLine();
        Computer [] buffer = new Computer[Amount];
        for (int i = 0; i < Amount-1; i++)
        {
            buffer[i] = list[i];
        }
        buffer[Amount-1] = new Computer(CPU,GPU,RAM,ROM);
        list = buffer;
    }

    public void RemoveFromShop(int index)
    {
        if (index >= Amount)
        {
            System.out.println("No computer with such number!");
        }
        else
        {
            Computer [] buffer = new Computer[Amount];
            for (int i = 0; i < index; i++)
            {
                buffer[i] = list[i];
            }
            for (int i = index; i < Amount-1; i++)
            {
                buffer[i] = list[i+1];
            }
            list = buffer;
            Amount--;
            System.out.println("\nComputer entry successfully deleted!\n");
        }
    }

    public void SearchCPU(String CPU)
    {
        boolean SearchPositive = false;
        boolean[] SearchList;
        SearchList = new boolean[Amount];
        for (int i = 0; i < Amount; i++)
        {
            SearchList[i] = false;
            if (list[i].getCPU().equals(CPU))
            {
                SearchList[i] = true;
                SearchPositive = true;
            }
        }
        if (SearchPositive == true)
        {
            System.out.println("Fitting models found!");
            for (int i = 0; i < Amount; i++)
            {
                if (SearchList[i] == true)
                {
                    System.out.printf("%nPC №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("No fitting models found");
        }
    }

    public void SearchGPU(String GPU)
    {
        boolean SearchPositive = false;
        boolean[] SearchList;
        SearchList = new boolean[Amount];
        for (int i = 0; i < Amount; i++)
        {
            SearchList[i] = false;
            if (list[i].getGPU().equals(GPU))
            {
                SearchList[i] = true;
                SearchPositive = true;
            }
        }
        if (SearchPositive == true)
        {
            System.out.println("Fitting models found!");
            for (int i = 0; i < Amount; i++)
            {
                if (SearchList[i] == true)
                {
                    System.out.printf("%nPC №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("No fitting models found");
        }
    }

    public void SearchRAM(int RAM)
    {
        boolean SearchPositive = false;
        boolean[] SearchList;
        SearchList = new boolean[Amount];
        for (int i = 0; i < Amount; i++)
        {
            SearchList[i] = false;
            if (list[i].getRAM() == RAM)
            {
                SearchList[i] = true;
                SearchPositive = true;
            }
        }
        if (SearchPositive == true)
        {
            System.out.println("Fitting models found!");
            for (int i = 0; i < Amount; i++)
            {
                if (SearchList[i] == true)
                {
                    System.out.printf("%nPC №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("No fitting models found");
        }
    }

    public void SearchROM(int ROM)
    {
        boolean SearchPositive = false;
        boolean[] SearchList;
        SearchList = new boolean[Amount];
        for (int i = 0; i < Amount; i++)
        {
            SearchList[i] = false;
            if (list[i].getROM() == ROM)
            {
                SearchList[i] = true;
                SearchPositive = true;
            }
        }
        if (SearchPositive == true)
        {
            System.out.println("Fitting models found!");
            for (int i = 0; i < Amount; i++)
            {
                if (SearchList[i] == true)
                {
                    System.out.printf("%nPC №%s%n%s", i, list[i].toString());
                }
            }
        }
        else
        {
            System.out.println("No fitting models found");
        }
    }

    public void Catalog()
    {
        for(int i = 0; i < Amount; i++)
        {
            System.out.printf("PC №%s%n%s%n",i,list[i].toString());
        }
    }
}
