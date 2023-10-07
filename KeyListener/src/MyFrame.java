import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {

    //create a data member for storing 3 key events
    private JLabel[] keyMessage;

    public MyFrame() {
        setTitle("KeyEventListener");


        //Window Closing Event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.addKeyListener(new MyKeyListener());


        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel(" getKeyCode()");
        keyMessage[1] = new JLabel(" getKeyChar()");
        keyMessage[2] = new JLabel(" getKeyText()");


        //3개의 레이블 컴포넌트를 컨텐트팬에 부착
        for (int i = 0; i < keyMessage.length; i++) {
            contentPane.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);
            keyMessage[i].setBackground(Color.yellow);
        }

        setSize(500, 600);
        setVisible(true);


        //컨텐트팬이 키 입력을 받을수 있도록 포커스 강제 지정
        contentPane.setFocusable(true);
        contentPane.requestFocus();


    }


    //Class for Key event handling
    class MyKeyListener implements KeyListener {


        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Key Typed");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(KeyEvent.getKeyText(keyCode));

            System.out.println("Key Pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Key Released");
        }

    }
}
