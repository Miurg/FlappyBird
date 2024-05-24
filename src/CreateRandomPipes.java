import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class CreateRandomPipes {


    CreateRandomPipes(JFrame Pane) throws IOException {
        BufferedImage pictureOfBird = ImageIO.read(new File("src/png/PipeLookUp.png"));
        GraphicComponent birdComponent = new GraphicComponent("Pipe", pictureOfBird);
        pictureOfBird = ImageIO.read(new File("src/png/PipeLookDown.png"));
        GraphicComponent birdComponent2 = new GraphicComponent("Pipe", pictureOfBird);

        int centerPipes = (int) (Math.random() * 300 + 100);


        birdComponent2.setBounds(Pane.getWidth(),centerPipes-550,100,500);
        birdComponent.setBounds(Pane.getWidth(), centerPipes+50,100,500);

        Pane.getLayeredPane().add(birdComponent, JLayeredPane.PALETTE_LAYER);
        Pane.getLayeredPane().add(birdComponent2, JLayeredPane.PALETTE_LAYER);
        java.util.Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Pane.getLayeredPane().remove(birdComponent2);
                Pane.getLayeredPane().remove(birdComponent);
                Pane.repaint();
                this.cancel();
            }
        }, 12000,1);
    }

}
