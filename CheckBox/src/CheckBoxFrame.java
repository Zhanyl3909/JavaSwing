import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxFrame extends JFrame implements ActionListener {


    public CheckBoxFrame() {
        setTitle("Check Box");
        setSize(300,500);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        JPanel p = new JPanel();
        bold = addCheckBox(p, "Bold");

        italic = addCheckBox(p, "Italic");
        getContentPane().add(p, "South");

        panel = new CheckBoxPanel();
        getContentPane().add(panel, "Center");
    }




    //adding CheckBox function
    public JCheckBox addCheckBox(JPanel p, String name) {
        JCheckBox c = new JCheckBox(name);
        c.addActionListener(this);
        p.add(c);

        return c;
    }





    //implement the ActionListener method
    @Override
    public void actionPerformed(ActionEvent e) {
        int m = (bold.isSelected()?Font.BOLD:0) +
                (italic.isSelected()?Font.ITALIC:0);
        panel.setFont(m);
    }

    //data members
    private CheckBoxPanel panel;
    private JCheckBox bold;
    private JCheckBox italic;

}
