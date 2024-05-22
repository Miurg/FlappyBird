import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class GraphicComponent extends JComponent
{

    BufferedImage picture;
    public final String nameOfComponent;

    GraphicComponent(String nameOfComponent,  BufferedImage picture) {
        this.nameOfComponent = nameOfComponent;
        this.picture = picture;
    }
    @Override
    public String getName()
    {
        return nameOfComponent;
    }
    @Override
    public void paintComponent(Graphics g) {
        // прорисовка фигуры
        g.drawImage(picture,0,0,  this.getWidth(), this.getHeight(), null);
    }
}