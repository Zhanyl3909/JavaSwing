//Main java swing
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyFrame();
        frame.show();
    }
}


//MyFrame java swing 
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(500,600);
        setTitle("Frame Sketch");
        setVisible(true);




        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Container contentPane = getContentPane();
        contentPane.add(new MyPanel());
    }
}




//MyPanel Java swing 
import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    public MyPanel() {
        addKeyListener(this);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int modifiers = e.getModifiers();
        int d;

        if((modifiers & InputEvent.SHIFT_MASK) != 0)
            d = 5;
        else
            d = 1;

        if(keyCode == KeyEvent.VK_LEFT) add(-d, 0);
        else if(keyCode == KeyEvent.VK_RIGHT) add(d, 0);
        else if(keyCode == KeyEvent.VK_UP) add(0,-d);
        else if(keyCode == KeyEvent.VK_DOWN) add(0,d);
    }


    //implementation methods
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
        int d;

        if(Character.isUpperCase(keyChar))
        {
            d = 5;
            keyChar = Character.toLowerCase(keyChar);
        } else {
            d = 1;
        }


        if(keyChar == 'h') add(-d, 0);
        else if(keyChar == 'l') add(d, 0);
        else if(keyChar == 'k') add(0, -d);
        else if(keyChar == 'j') add(0, d);
    }

    @Override
    public void keyReleased(KeyEvent e) {}





    //hooked function
    @Override
    public boolean isFocusTraversable() {return true;}


    //add method
    public void add(int dx, int dy) {
        end.x += dx;
        end.y += dy;

        Graphics g = getGraphics();
        g.drawLine(start.x, start.y, end.x, end.y);
        g.dispose();
        start.x = end.x;
        start.y = end.y;
    }


    //data member
    private Point start = new Point(0,0);
    private Point end = new Point(0,0);
}
