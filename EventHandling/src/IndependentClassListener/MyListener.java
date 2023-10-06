import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//independent Class Listener, Should be Overriden 

public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        button.setText("Button CLicked !!!");
    }
}
