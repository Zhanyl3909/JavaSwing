import javax.swing.*;
import java.awt.*;

public class NotHelloWorldPanel extends JPanel {
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.drawString("Not Hello World", 70,100);
        g.drawRect(200, 300, 200, 300);
    }
}
