import javax.swing.*;
import javax.swing.text.Document;

public class IntTextField extends JTextField {
    public IntTextField(int defval, int size) {
        super("" + defval,size);
    }

    protected Document createDefaultModel() {
        return new IntTextDocument();
    }

    public boolean checkValid() {
        try {
            Integer.parseInt(getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public int getValue(){
        try {
            return Integer.parseInt(getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
