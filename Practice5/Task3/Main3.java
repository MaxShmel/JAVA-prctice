package Practice5.Task3;
import javax.swing.*;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Main3 extends JFrame
{
    public Main3 (String a) throws IOException
    {
        super("Image");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        BufferedImage img = ImageIO.read(new File(a));
        JLabel label = new JLabel(new ImageIcon(img));
        add(label);
    }

    public static void main (String[] args) throws IOException
    {
        new Main3(args[0]).setVisible(true);
    }
}
