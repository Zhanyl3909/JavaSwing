import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SeparateFrame extends JFrame {
    public SeparateFrame() {
        setSize(300,500);
        setTitle("Separate GUI test");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        JPanel panel = new JPanel();

        Action blueAction = new ColorAction("Blue", new ImageIcon("C:\\Users\\장을아이\\Desktop\\JAVA\\SeparateGUI\\src\\blue.png"),
                Color.blue, panel);
        Action greenAction = new ColorAction("Green", new ImageIcon("C:\\Users\\장을아이\\Desktop\\JAVA\\SeparateGUI\\src\\green.png"),
                Color.GREEN, panel);
        Action yellowAction = new ColorAction("Yellow", new ImageIcon("C:\\Users\\장을아이\\Desktop\\JAVA\\SeparateGUI\\src\\yellow.png"),
                Color.yellow, panel);



        panel.add(new ActionButton(yellowAction));
        panel.add(new ActionButton(greenAction));
        panel.add(new ActionButton(blueAction));


        /*

        //KeyListener
        panel.registerKeyboardAction(yellowAction,
                KeyStroke.getKeyStroke(KeyEvent.VK_Y,0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        panel.registerKeyboardAction(greenAction,
                KeyStroke.getKeyStroke(KeyEvent.VK_G,0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

        panel.registerKeyboardAction(blueAction,
                KeyStroke.getKeyStroke(KeyEvent.VK_B,0),
                JComponent.WHEN_IN_FOCUSED_WINDOW);

         */

        Container contentPane = getContentPane();
        contentPane.add(panel);



        //Create a Menu
        JMenu menu = new JMenu("Color");
        menu.add(yellowAction);
        menu.add(blueAction);
        menu.add(greenAction);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);


    }
}
