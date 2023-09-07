import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CentredFrame extends JFrame {

    public CentredFrame() {
        //title setting
        setTitle("Centred Frame");

        //closing action
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //toolkit for screen
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        int screenHeight = d.height;
        int screenWidth = d.width;
        setSize(screenWidth/2,screenHeight/2);
        setLocation(screenWidth/4, screenHeight/4);


    }
}
