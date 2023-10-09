import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SeparateGUI_Frame extends JFrame {
    public SeparateGUI_Frame(){
        setSize(600,700);
        setTitle("AbstractAction Menu ");
        setVisible(true);

        //Window Closing Action
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        JPanel panel = new JPanel();

        Action blueAction = new ColorAction("Blue", new ImageIcon("/Users/zhanylai11/Desktop/learnJava/Menu/src/blue.png"),
                Color.BLUE, panel);

        Action purpleAction = new ColorAction("Purple", new ImageIcon("/Users/zhanylai11/Desktop/learnJava/Menu/src/purple.png"),
                Color.PINK, panel);

        Action yellowAction = new ColorAction("Yellow", new ImageIcon("/Users/zhanylai11/Desktop/learnJava/Menu/src/yellow.png"),
                Color.YELLOW, panel);


        panel.registerKeyboardAction(blueAction, KeyStroke.getKeyStroke(KeyEvent.VK_Y,0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        panel.registerKeyboardAction(yellowAction, KeyStroke.getKeyStroke(KeyEvent.VK_B,0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        panel.registerKeyboardAction(purpleAction, KeyStroke.getKeyStroke(KeyEvent.VK_P,0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);


        Container contentPane = getContentPane();
        contentPane.add(panel);



        JMenu m = new JMenu("Color");
        m.add(blueAction);
        m.add(yellowAction);
        m.add(purpleAction);

        JMenuBar mbr = new JMenuBar();
        mbr.add(m);
       setJMenuBar(mbr);

    }
}
