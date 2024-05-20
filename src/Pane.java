import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pane extends JFrame {
    javax.swing.JLayeredPane lp = getLayeredPane();
    public Pane() {
        super("Flappy Bird");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        setSize(screenSize.width/2, screenSize.height/2);

        setVisible(true);
        centerLocationWindow();
        setResizable(false);
    }
    private void centerLocationWindow() throws HeadlessException {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        final int x = (screenSize.width - this.getWidth()) / 2;
        final int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
    }
}
