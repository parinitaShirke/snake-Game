import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame{
    Frame(){
        this.setTitle("SnakeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }
}
