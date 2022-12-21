package Practice2.Task5;

import Practice2.Task5.DogKennel;

public class DogTest
{
    public static void main(String[] args)
    {
        DogKennel Alpha = new DogKennel(5);
        Alpha.getListedDogs();
        Alpha.setAge(3, 10);
        Alpha.setName(3, "Doggo");
        Alpha.getListedDogs();
        Alpha.getHumanAge(3);
    }
}
