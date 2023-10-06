import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("Action Event Listener");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        contentPane.add(btn);



        //Anonymous Class Listener
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();

                if(b.getText().equals("Action"))
                    b.setText("액션");
                else {
                    b.setText("Action");
                }
                setTitle(b.getText());
            }
        });

        setSize(500,600);
        setVisible(true);


    }
}
