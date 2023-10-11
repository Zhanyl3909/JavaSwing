import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    public MyPanel() {
        JButton newBt = new JButton("New");
        add(newBt);
        newBt.addActionListener(this);

        closeAllButton = new JButton("Close All");
        add(closeAllButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //handle new button
        MyFrame frame = new MyFrame();
        counter++;

        frame.setVisible(true);
        frame.setTitle("Window " + counter);
        frame.setSize(200,300);
        frame.setLocation(30 * counter, 30 * counter);

        frame.show();
        closeAllButton.addActionListener(frame);

    }


    //data member
    private int counter = 0;
    private JButton closeAllButton;
}
