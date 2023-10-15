import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioButtonFrame extends JFrame implements ActionListener {

    public RadioButtonFrame() {
        setTitle("Radio Button");
        setSize(300,500);

        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        JPanel buttonPanel = new JPanel();
        ButtonGroup group = new ButtonGroup();
        smallButton = addRadioButton(buttonPanel, group, "Small", false);
        mediumButton = addRadioButton(buttonPanel, group, "Medium", true);
        largeButton = addRadioButton(buttonPanel, group, "Large", false);
        xlargeButton = addRadioButton(buttonPanel, group, "XL", false);

        getContentPane().add(buttonPanel, "South");
        panel = new RadioButtonPanel();
        getContentPane().add(panel, "Center");

    }


    public JRadioButton addRadioButton(JPanel buttonPanel, ButtonGroup g, String buttonName, boolean v) {
        JRadioButton button = new JRadioButton(buttonName,v);
        button.addActionListener(this);
        g.add(button);
        buttonPanel.add(button);


        return button;
    }

    //Button Actions

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == smallButton) panel.setSize(8);
        else if(source == mediumButton) panel.setSize(12);
        else if(source == largeButton) panel.setSize(14);
        else if(source == xlargeButton) panel.setSize(19);

    }


    //data members
    private RadioButtonPanel panel;
    private JRadioButton smallButton;
    private JRadioButton mediumButton;
    private JRadioButton largeButton;
    private JRadioButton xlargeButton;


}
