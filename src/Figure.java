import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

class Figure extends JComponent
{

    private final int type;


    Figure(int type) {
        this.type = type;
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
                    g.drawImage(myPicture,0,0, this.getBounds().width, this.getBounds().height, null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            case 2 ->
            {
                try {
                    BufferedImage myPicture = ImageIO.read(new File("src/Pipe.png"));
                    g.drawImage(myPicture,0,0, this.getBounds().width, this.getBounds().height, null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}