import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.Clock;

public class ValidationTestFrame extends JFrame implements DocumentListener {
    public ValidationTestFrame() {
        setTitle("ValidationTest");
        setSize(300,500);
        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();

        JPanel p = new JPanel();
        hourField = new IntTextField(12, 3);
        p.add(hourField);
        hourField.getDocument().addDocumentListener(this);

        minuteField = new IntTextField(0,3);
        p.add(minuteField);
        minuteField.getDocument().addDocumentListener(this);

        contentPane.add(p, "South");
        clock = new ClockPanel();
        contentPane.add(clock,"Center");



    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        setClock();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        setClock();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {}


    //setClock function made by me
    public void setClock() {
        if(hourField.checkValid()&&minuteField.checkValid()) {
            int hours = hourField.getValue();
            int minutes = minuteField.getValue();
            clock.setTime(hours, minutes);
        }
    }


    //data members
    private IntTextField hourField;
    private IntTextField minuteField;
    private ClockPanel clock;



}
