import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(500,600);
        setTitle("Closeable Window");
        setVisible(true);

        //Adding EventListener for Window frame
      addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }

          @Override
          public void windowDeactivated(WindowEvent e) {
              System.out.println("Window frame is deactivated");
          }

          @Override
          public void windowActivated(WindowEvent e) {
              System.out.println("Window frame is activated");
          }
      });
    }
}
