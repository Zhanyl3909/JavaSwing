//Main
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyFrame();
        frame.show();
    }
}




//MyFrame
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame() {

        setTitle("Layout Frame");
        setSize(500,600);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();
        contentPane.add(new MyPanel());
    }
}


//MyPanel
import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    public MyPanel() {
        metalButton = new JButton("Metal");
        motifButton = new JButton("Motif");
        windowsButton = new JButton("Windows");


        add(metalButton);
        add(motifButton);
        add(windowsButton);


        metalButton.addActionListener(this);
        motifButton.addActionListener(this);
        windowsButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();
        String plaf = "";

        if(src == metalButton)
            plaf = "javax.swing.plaf.metal.MetalLookAndFeel";
        else if(src == motifButton)
            plaf = "com.sun.javax.swing.plaf.motif.MotifLookAndFeel";
        else if(src == windowsButton)
            plaf = "som.sun.javax.swing.plaf.windows.WindowsLookAndFeel";

        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception ec) {}

    }



    //Create data members
    private JButton metalButton;
    private JButton motifButton;
    private JButton windowsButton;


}
