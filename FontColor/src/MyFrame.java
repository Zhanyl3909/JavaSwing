import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {

    private MyPanel panel = new MyPanel();
    public MyFrame() {
        setVisible(true);
        setSize(500,600);
        setTitle("Frame");



        /*
        //method 1 to add Panel
        Container cont = getContentPane();
        cont.add(new MyPanel());
         */



        //method 2 to add Panel
        setContentPane(panel);


        //Closing Window Listener
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
