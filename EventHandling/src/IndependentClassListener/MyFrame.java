import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {


    //data members
    private JButton button;
    private JLabel label;

    public MyFrame() {
        setSize(500,600);
        setTitle("Independent Class Listener");


        //Closing Action listener
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        JPanel panel = new JPanel();
        button = new JButton("Click the button");
        label = new JLabel("Place for Button");

        button.addActionListener(new MyListener());   /add Independent ActionListener Class

        panel.add(button);
        panel.add(label);
        this.add(panel);   //adding panel to a contentPane
        setVisible(true);
    }
}
