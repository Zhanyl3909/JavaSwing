import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;

public class MyPanel extends JPanel implements KeyListener {


    public MyPanel() {
        addKeyListener(this);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int modifiers = e.getModifiers();
        int d;

        if((modifiers& InputEvent.SHIFT_MASK)!=0)
            d = 5;
        else
            d = 1;


        if(keyCode == KeyEvent.VK_LEFT) add(-d, 0);
        else if(keyCode == KeyEvent.VK_RIGHT) add(d,0);
        else if(keyCode == KeyEvent.VK_UP) add(0,-d);
        else if(keyCode == KeyEvent.VK_DOWN) add(0,d);
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {

        char keyChar = e.getKeyChar();
        int d;

        if(Character.isUpperCase(keyChar)) {
            d = 5;
            keyChar = Character.toLowerCase(keyChar);
        }
        else
            d = 1;




        if(keyChar == 'h') add(-d, 0);
        else if(keyChar == 'l') add(d,0);
        else if(keyChar == 'k') add(0,-d);
        else if(keyChar == 'j') add(0,d);
    }


    //hoked function ?
    public boolean isFocusTraversable(){return true;}


    public void add(int dx, int dy) {
        end.x += dx;
        end.y += dy;


        Graphics g = getGraphics();
        g.drawLine(start.x, start.y, end.x, end.y);
        g.dispose();
        start.x = end.x;
        start.y = end.y;
    }

    //data members
    private Point start = new Point(0,0);
    private Point end = new Point(0,0);



}
