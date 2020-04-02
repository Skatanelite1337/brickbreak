import javax.swing.JFrame;
import java.awt.*;

public class Graphics {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Gameplay gameplay = new gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Sten spel");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(GamePlay);


    }

    public void fillRect(int i, int i1, int i2, int i3) {
    }

    public void setColor(Color black) {
    }
}
