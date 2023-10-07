import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UpDown extends JFrame {


    //data members
    private final int FLYING_UNIT = 10;
    private JLabel lab = new JLabel("HELLO");


    public UpDown() {
        setTitle("Up Down Left Right");

        //window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Container c = getContentPane();
       // c.setLayout(null);
        c.addKeyListener(new MyKeyListener());
        c.setLocation(50, 50);
        c.add(lab);

        setSize(500, 600);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();


        //Adding Mouse listener in case ContentPane lose focus
        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Component cm = (Component) e.getSource();
                cm.setFocusable(true);
                cm.requestFocus();
            }
        });

    }
        class MyKeyListener extends KeyAdapter {
            //key listener adding

                public void keyPressed(KeyEvent e) {
                    int keyCode = e.getKeyCode();  //입력된 코드를 알아낸다

                    switch (keyCode) {
                        case KeyEvent.VK_UP:
                            lab.setLocation(lab.getX(), lab.getY() - FLYING_UNIT); break;
                        case KeyEvent.VK_DOWN:
                            lab.setLocation(lab.getX(), lab.getY() + FLYING_UNIT); break;
                        case KeyEvent.VK_LEFT:
                            lab.setLocation(lab.getX() - FLYING_UNIT, lab.getY()); break;
                        case KeyEvent.VK_RIGHT:
                            lab.setLocation(lab.getX() + FLYING_UNIT, lab.getY()); break;


                    }
                }
            }
        }





