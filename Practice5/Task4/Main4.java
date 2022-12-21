package Practice5.Task4;
import Practice5.Task4.Animation;

import javax.swing.*;
public class Main4 extends Animation {
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("D:\\MIREA\\JAVA\\PRACT\\PR1\\Arrow1.png").getImage());
        framlist.add(new ImageIcon("D:\\MIREA\\JAVA\\PRACT\\PR1\\Arrow2.png").getImage());
        framlist.add(new ImageIcon("D:\\MIREA\\JAVA\\PRACT\\PR1\\Arrow3.png").getImage());
        framlist.add(new ImageIcon("D:\\MIREA\\JAVA\\PRACT\\PR1\\Arrow4.png").getImage());
        framlist.add(new ImageIcon("D:\\MIREA\\JAVA\\PRACT\\PR1\\Arrow5.png").getImage());
        Animation animImg = new Animation();
        while (true)
        {
            for (int i = 0; i < 5; i++)
            {
                image = framlist.get(i);
                animImg.repaint();
                try
                {
                    Thread.sleep(380);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}