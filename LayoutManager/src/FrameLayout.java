import javax.swing.*;
import java.awt.*;

public class FrameLayout extends JFrame {
    public FrameLayout() {

        setTitle("Layout change");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();

        c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));


        //Creating components (Button);
        JButton add = new JButton("Add");
        JButton sub = new JButton("Sub");
        JButton div = new JButton("Div");
        JButton mul = new JButton("Mul");
        JButton calc = new JButton("Calculate");



        //Adding Components to Container
        c.add(add);
        c.add(sub);
        c.add(div);
        c.add(mul);
        c.add(calc);

        setSize(600, 600);
        setVisible(true);

    }
}
