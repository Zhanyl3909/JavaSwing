import javax.swing.*;

public class ActionButton extends JButton {
    public ActionButton(Action a) {
        setText((String)a.getValue(Action.NAME));
        Icon icon = (Icon) a.getValue(Action.SMALL_ICON);
        if(icon != null)
            setIcon(icon);

        addActionListener(a);
    }
}
