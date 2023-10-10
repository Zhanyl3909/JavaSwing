//Main Java Class
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyFrame();
        frame.show();
    }
}




//MyFrame Java Class
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(500,600);
        setTitle("Not Hello World drawString PaintComponents");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();
        add(new MyPanel());
    }
}







//MyPanel Java Class
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Java Swing Hello World", 200, 300);
    }
}

