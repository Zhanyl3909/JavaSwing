import javax.swing.*;
import java.awt.*;

public class CheckBoxPanel extends JPanel {

    public CheckBoxPanel() {
        setFont(Font.PLAIN);
    }

    public void setFont(int m) {
     setFont(new Font("SanSerif", m,30));
     repaint();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("The quick brown fox jums over the lazy dog", 0, 50);
    }
}
