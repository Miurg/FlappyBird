import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class initMainGraphics {
    public initMainGraphics(JFrame Pane) throws IOException {

        BufferedImage pictureOfBird = ImageIO.read(new File("src/png/Bird.png"));
        GraphicComponent birdComponent = new GraphicComponent("Bird", pictureOfBird);
        BufferedImage backgroundPicture = ImageIO.read(new File("src/png/Background.png"));
        GraphicComponent backgroundComponent = new GraphicComponent("Background", backgroundPicture);
        BufferedImage floorPicture = ImageIO.read(new File("src/png/Floor.png"));
        GraphicComponent floorComponent = new GraphicComponent("Floor", floorPicture);

        birdComponent.setBounds(0,0,Pane.getHeight()/10,Pane.getHeight()/10);
        backgroundComponent.setBounds(0,-(Pane.getHeight()-floorPicture.getHeight()),Pane.getWidth(),Pane.getHeight());
        floorComponent.setBounds(0, floorPicture.getHeight(), Pane.getWidth(), Pane.getHeight()-floorPicture.getHeight());


        Pane.getLayeredPane().add(birdComponent, JLayeredPane.PALETTE_LAYER);
        Pane.getLayeredPane().add(backgroundComponent,JLayeredPane.DEFAULT_LAYER);
        Pane.getLayeredPane().add(floorComponent, JLayeredPane.PALETTE_LAYER);
    }
}
