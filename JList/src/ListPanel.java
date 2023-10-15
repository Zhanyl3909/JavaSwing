import javax.swing.*;
import java.awt.*;



public class ListPanel extends JPanel {
    public ListPanel() {
        setAttribute("");
    }

    //set attribute function made by me
    public void setAttribute(String w)
    {
        text = "The " + w + "fox jumps over the lazy dog";
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString(text,0,50);
    }



    //local data member;
    private String text;


}
