import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseClick extends JFrame {

    public MouseClick() {
        setTitle("Double Click");

        //Close window
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener());
        setSize(500,600);
        setVisible(true);

    }

    class MyMouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            if(e.getClickCount() == 2) {
                int r = (int)(Math.random()*256);
                int g = (int)(Math.random()*256);
                int b = (int)(Math.random()*256);


                Component component = (Component) e.getSource();
                component.setBackground(new Color(r,g,b));
            }
        }
    }
}
