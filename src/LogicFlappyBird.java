import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class LogicFlappyBird  {
    int timer = 0;
    public LogicFlappyBird(JFrame Pane)
    {
        Component bird = null;
        try {
            for (int i = 0; i < Pane.getLayeredPane().getComponentCount(); i++) {
                if (Objects.equals(Pane.getLayeredPane().getComponent(i).getName(), "Bird")) {
                    bird = Pane.getLayeredPane().getComponent(i);
                    break;
                }
            }
            if (bird == null) {
                throw new Exception("Bird not found!");
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }


        java.util.Timer t = new Timer();
        t.schedule(new PipesLogicTask(Pane, 2000), 0, 5);
        Pane.addKeyListener(new spaceListener());
        t.schedule(new GravityOfBirdTask(bird, Pane, 0.001f, 5), 0, 1);
    }

}
