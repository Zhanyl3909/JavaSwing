import javax.swing.*;
import java.awt.*;

public class RadioButtonPanel extends JPanel {
    public RadioButtonPanel() {
        setSize(12);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("The quick brown fox jumps over the lazy dog", 0, 50);
    }

    public void setSize(int n) {
        setFont(new Font("SanSerif", Font.PLAIN, n));
        repaint();
    }
}
