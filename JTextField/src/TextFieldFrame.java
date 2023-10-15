import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextEditFrame extends JFrame {
    //화면 구성
    public TextEditFrame() {
        setTitle("TextEditFrame");
        setSize(300,500);
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();
        JPanel panel = new JPanel();

        JButton replaceButton = new JButton("Replace");
        panel.add(replaceButton);

        replaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String f = from.getText();
                int n = textArea.getText().indexOf(f);

                if(n>=0 && f.length()>0)
                    textArea.replaceRange(to.getText(),n, n+f.length());
            }
        });

        from = new JTextField(8);
        panel.add(from);

        panel.add(new JLabel("with"));

        to = new JTextField(8);
        panel.add(to);

        textArea = new JTextArea(8,40);
        scrollPane = new JScrollPane(textArea);

        contentPane.add(panel,"South");
        contentPane.add(scrollPane, "Center");
    }



    //data members
    private JScrollPane scrollPane;
    private JTextArea textArea;
    private JTextField from, to;
}
