import javax.crypto.spec.PSource;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.TimerTask;
import java.util.Vector;

public class GravityOfBirdTask extends TimerTask {

    Component bird;

    float velocity = 0f;

    JFrame Pane;

    float gravitationConstant = 0.98f;

    float timestep;
    int jumpPower;
    int counter = 0;
    int numberOfSpacePressedInGravity = 0;
    float leftoverVelocity = 0f;
    float time = 100;

    float maxVelocity = 10;
    GravityOfBirdTask (Component bird, JFrame Pane, float timestep, int jumpPower)
    {
        this.bird = bird;
        this.Pane = Pane;
        this.timestep = timestep;
        this.jumpPower = jumpPower;
    }
    @Override
    public void run() {
        time++;
        velocity = velocity+gravitationConstant*timestep;
        leftoverVelocity = leftoverVelocity + velocity;
        bird.setLocation(bird.getX(),(bird.getY()+ (int) leftoverVelocity));
        leftoverVelocity = leftoverVelocity - (int) leftoverVelocity;
        if (velocity>maxVelocity) velocity=maxVelocity;
        if (new spaceListener().numberOfSpacePressed != numberOfSpacePressedInGravity)
        {
            velocity = -jumpPower;
            bird.setLocation(bird.getX(),bird.getY()-(int)velocity);
        }

    }


}
