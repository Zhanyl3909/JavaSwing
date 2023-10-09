import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ColorAction extends AbstractAction {

    public ColorAction(String name, Icon icon, Color c, Component comp) {
        putValue(Action.NAME, name);
        putValue(Action.SMALL_ICON, icon);
        putValue("Color", c);
        target = comp;
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        Color c = (Color) getValue("Color");
        target.setBackground(c);
        target.repaint();
    }


    private Component target;
}
