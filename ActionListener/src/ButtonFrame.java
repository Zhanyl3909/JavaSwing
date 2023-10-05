import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonFrame extends JFrame {
    public ButtonFrame() {
        setSize(500,600);
        setVisible(true);
        setTitle("Button Frame");

        //Window Closing Listner
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });



      //Add panle to a ContentPane 
        Container contentPane = getContentPane();
        contentPane.add(new ButtonPanel());
    }
}
