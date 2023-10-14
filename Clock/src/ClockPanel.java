import javax.swing.*;
import java.awt.*;

public class ClockPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(0,0,100, 100);
        double hourAngle = 2 * Math.PI * (minutes - 3 * 60) / (12 * 60);
        double minuteAngle = 2 * Math.PI * (minutes - 15) / 60;

        g.drawLine(50, 50, 50 + (int)(30 * Math.cos(hourAngle)),  50 + (int)(30 * Math.sin(hourAngle)));
        g.drawLine(50, 50, 50 + (int)(30 * Math.cos(minuteAngle)),  50 + (int)(30 * Math.sin(minuteAngle)));
    }

    public void setTime(int h, int m) {
        minutes = h * 60 + m;
        repaint();
    }

    public void tick() {
        minutes++;
        repaint();
    }


    private int minutes = 0;

}
