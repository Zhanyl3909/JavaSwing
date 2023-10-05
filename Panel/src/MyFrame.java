import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame()  {
        setTitle("Closeable frame");
        setSize(500,600);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();   //create a contentPane
        contentPane.add(new NotHelloWorldPanel());  //adding panel into contentPane
    }
}
