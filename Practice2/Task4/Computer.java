package Practice2.Task4;

public class Computer
{
    private String CPU;
    private String GPU;
    private int RAM;
    private int ROM;

    public Computer(String CPU, String GPU, int RAM, int ROM)
    {
        this.CPU=CPU;
        this.GPU=GPU;
        this.RAM=RAM;
        this.ROM=ROM;
    }

    public void setCPU(String CPU)
    {
        this.CPU = CPU;
    }

    public String getCPU()
    {
        return CPU;
    }

    public void setGPU(String GPU)
    {
        this.GPU = GPU;
    }

    public String getGPU()
    {
        return GPU;
    }

    public void setRAM(int RAM)
    {
        this.RAM = RAM;
    }

    public int getRAM()
    {
        return RAM;
    }

    public void setROM(int ROM)
    {
        this.ROM = ROM;
    }

    public int getROM()
    {
        return ROM;
    }

    public String toString()
    {
        return "CPU: "+this.CPU+"\nGPU: "+this.GPU+"\nRAM: "+this.RAM+"\nROM: "+this.ROM;
    }
}
