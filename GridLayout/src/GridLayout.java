import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx(){
        setTitle("GridLayout Simple");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,2);  //4-rows; 2-cols
        grid.setVgap(5);   //격자 사이에 수직 간격을 5 픽셀로 설정

        Container c = getContentPane();
        c.setLayout(grid);

        c.add(new JLabel(" Name"));
        c.add(new JTextField(" "));

        c.add(new JLabel(" Student ID"));
        c.add(new JTextField(" "));

        c.add(new JLabel(" Major"));
        c.add(new JTextField(" "));

        c.add(new JLabel(" Subject"));
        c.add(new JTextField(" "));


        setSize(300,200);
        setVisible(true);

    }
}
