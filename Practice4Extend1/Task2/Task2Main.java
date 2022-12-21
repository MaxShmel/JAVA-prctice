package Practice4Extend1.Task2;

public class Task2Main
{
    public static void main(String[] args)
    {
        Task2Phone[] phone = new Task2Phone[3];
        phone[0] = new Task2Phone(8916_555_35_35L, (short) 21, 75.1);
        phone[1] = new Task2Phone(8940_111_22_33L, (short) 250, 20.1);
        phone[2] = new Task2Phone(8977_123_45_67L, (short) 100, 50.7);
        for (int i = 0; i < 3; ++i)
        {
            System.out.println(phone[i].toString());
        }
        System.out.printf("Номер: %s %s%n",phone[0].getNumber(),phone[0].receiveCall("Иван"));
        System.out.printf("Номер: %s %s%n",phone[1].getNumber(),phone[1].receiveCall("Михаил"));
        System.out.printf("Номер: %s %s%n",phone[2].getNumber(),phone[2].receiveCall("Александр"));

        System.out.println(phone[0].receiveCall("Полина", 8901_432_42_43L));
        long[] number = new long[3];
        number[0] = 8916_123_32_32L;
        number[1] = 8961_111_12_34L;
        number[2] = 8916_999_77_55L;
        phone[0].sendMessage(3, number);
    }
}
