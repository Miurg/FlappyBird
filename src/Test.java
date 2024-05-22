import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Test extends JFrame {

    Timer t;
    private int sec = 0;
    private boolean stop = true; // set to false to stop the program.
    JLabel lab;
    JButton startBtn;
    JButton stopBtn;

    Test() {
        super("Timer In Java");
        this.setSize(770, 440);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        lab = new JLabel();
        startBtn = new JButton("start");
        startBtn.addActionListener((e)->{
            stop = false;
        });
        stopBtn = new JButton("stop");
        stopBtn.addActionListener((e)->{
            stop = true;
        });
        lab.setText("sec : 0 , min : 0");
        this.add(lab);
        this.add(startBtn);
        this.add(stopBtn);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        Timer t = new Timer();
        t.schedule(new TimerTask() {
                       @Override
                       public void run() {
                           if(!stop){
                               sec++;
                               SwingUtilities.invokeLater(()->{
                                   lab.setText("sec : "+(sec%60)+" , min : "+(sec/60));
                               });
                           }
                       }
                   }
                , 0, 1000);
    }



    public static void main(String[] args) {
        Test t = new Test();
        t.setVisible(true);
    }
}
