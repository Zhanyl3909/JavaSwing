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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.ContentHandler;
import java.time.Clock;

public class MyFrame extends JFrame implements DocumentListener {

    public MyFrame() {
        setTitle("Text Test ");
        setSize(400,500);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Container contentPane = getContentPane();

        JPanel panel = new MyPanel();
        hourField = new IntTextField(12,3);
        panel.add(hourField);
        hourField.getDocument().addDocumentListener(this);


        minuteField = new IntTextField(0,3);
        panel.add(minuteField);
        minuteField.getDocument().addDocumentListener(this);



        contentPane.add(panel, "South");
        clock = new ClockPanel();
        contentPane.add(clock, "Center");
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



    public void setClock() {
      if(hourField.isValid() && minuteField.isValid()) {
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






//IntTextDocument
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class IntTextDocument extends PlainDocument {
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(str == null) return;
        String oldString = getText(0, getLength());
        String newString = oldString.substring(0, offs) + str + oldString.substring(offs);

        try {
            Integer.parseInt(newString + "0");
            super.insertString(offs, str, a);
        } catch (NumberFormatException e) {}
    }
}








//intTextField
import javax.swing.*;
import javax.swing.text.Document;

public class IntTextField extends JTextField {
    public IntTextField(int defval, int size) {
        super("" + defval, size);
    }


    protected Document createDefaultMode() {
        return new IntTextDocument();
    }



    public boolean isValid() {
        try {
            Integer.parseInt(getText());
            return  true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public int getValue() {
        try {
            return Integer.parseInt(getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }



}






//ClockPanel
import javax.swing.*;
import java.awt.*;

public class ClockPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(0,0,100,100);
        double hourAngle = 2 * Math.PI * (minutes - 3 * 60) / (12 * 60);
        double minuteAngle = 2 * Math.PI * (minutes - 15) / 60;

        g.drawLine(50, 50,
                50 + (int) (30 * Math.cos(hourAngle)),
                50 + (int) (30 * Math.sin(hourAngle))
                );

        g.drawLine(50, 50,
                50 + (int) (45 * Math.cos(minuteAngle)),
                50 + (int) (45 * Math.sin(minuteAngle))
        );

    }


    public void setTime(int h, int m) {
        minutes = h * 60 + m;
        repaint();
    }

    public void tick() {
        minutes++;
        repaint();
    }


    private int minutes = 0;
}

