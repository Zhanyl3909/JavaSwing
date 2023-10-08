import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(500,600);
        setTitle("Sketch");
        setVisible(true);

        //window Closing event
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
