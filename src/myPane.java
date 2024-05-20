import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class myPane {
    public static void main(String[] args) throws IOException {
        JFrame Pane = new Pane();
        Figure bird = new Figure(1, 500,500);

        Pane.add(bird);
    }
}