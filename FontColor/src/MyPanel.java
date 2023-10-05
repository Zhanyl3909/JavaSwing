import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.blue);
        g.drawString("I Love Java Swing", 30, 30);

        g.setColor(new Color(255,0,0));
        g.setFont(new Font("Arial", Font.ITALIC, 30));
        g.drawString("How Much?", 30, 60);

        g.setColor(new Color(0x00ff00ff));
        for(int i =1; i<=5; i++) {
            g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
            g.drawString("This Much", 30, 60+i*60);
        }

    }
}
