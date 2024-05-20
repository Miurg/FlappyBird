import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

class Figure extends JComponent
{

    private final int type;
    int width;
    int height;


    Figure(int type, int width, int height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public void paintComponent(Graphics g) {
        // прорисовка фигуры
        switch (type)
        {
            case 0 ->
            {
                g.setColor(Color.WHITE);
                g.fillRect(0,0,this.getBounds().width,this.getBounds().height);
            }
            case 1 ->
            {
                try {
                    BufferedImage myPicture = ImageIO.read(new File("src/Bird.png"));
                    g.drawImage(myPicture,0,0, width, height, null);
                } catch (IOException e) {
                    System.out.println("nen");
                    throw new RuntimeException(e);
                }
            }
        }
    }
}