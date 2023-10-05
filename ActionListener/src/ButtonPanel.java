import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel

        implements ActionListener {


   public ButtonPanel() {
       yellowButton = new JButton("Yellow");
       greenButton = new JButton("Green");
       redButton = new JButton("Red");

       add(yellowButton);
       add(greenButton);
       add(redButton);


       yellowButton.addActionListener(this);
       greenButton.addActionListener(this);
       redButton.addActionListener(this);
   }




    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Color c = getBackground();

        if(source == yellowButton) c = Color.yellow;
        else if (source == greenButton) {
            c = Color.GREEN;
        } else {
            c = Color.red;
        }

        setBackground(c);
        repaint();
    }





    //data members
    private JButton yellowButton;
    private JButton greenButton;
    private JButton redButton;
}
