import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx(){
        setTitle("ContentPane and JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //frame window closing

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.pink);
        contentPane.setLayout(new FlowLayout());

        JButton button = new JButton("Click");  // first initialize
        contentPane.add(button);

        contentPane.add(new JButton("Cancel"));     //create a button 
        contentPane.add(new JButton("OK"));

        setSize(400, 650);
        setVisible(true);


    }
}
