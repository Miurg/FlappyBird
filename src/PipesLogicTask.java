import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.TimerTask;

public class PipesLogicTask extends TimerTask {

    int timer = 0;

    int frequencyOccurrencePipes = 2;

    int pipesCount = 0;


    JFrame Pane;

    PipesLogicTask (JFrame Pane, int frequencyOccurrencePipes)
    {
        this.Pane = Pane;
        this.frequencyOccurrencePipes = frequencyOccurrencePipes;
    }
    @Override
    public void run() {
        SwingUtilities.invokeLater(()->{
            timer= timer + 5;
            if (timer>=frequencyOccurrencePipes)
            {
                timer = 0;
                try {
                    new CreateRandomPipes(Pane);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            //Move all pipes
            Arrays.stream(Pane.getLayeredPane().getComponents()).map(component -> {
                if (component.getName().equals("Pipe")) return component;
                else return null;
            }).filter(Objects::nonNull).forEach(component ->
                    component.setLocation(component.getX()-1,component.getY()));
        });
    }
}
