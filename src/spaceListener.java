import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class spaceListener implements KeyListener {

    int numberOfSpacePressed = 0;
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_SPACE) {
            numberOfSpacePressed++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
