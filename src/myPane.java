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
        Figure bird = new Figure(1);
        Figure pipes = new Figure(2);
        Figure pipe = new Figure(2);
        pipe.setBounds(0,0,100,100);
        pipes.setBounds(100,100,10,10);
        bird.setBounds(100,100,100,100);
        Pane.getLayeredPane().add(pipe);
        Pane.getLayeredPane().add(bird);
        Pane.getLayeredPane().add(pipes);
    }
}