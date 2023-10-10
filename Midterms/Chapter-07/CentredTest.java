import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    public MyFrame() {
        setVisible(true);
        setTitle("Closable frame");
        setSize(500,600);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Toolkit
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        int screenHeight = d.height;
        int screenWidth = d.width;

        setSize(screenWidth/2, screenHeight/2);
        setLocation(screenWidth/4, screenHeight/4);

        Image img = tk.getImage("C:\\Users\\장을아이\\Desktop\\JAVA\\Chapter07\\src\\draw.png");
        setIconImage(img);
    }
}













//Main java Class
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new MyFrame();
        frame.show();
    }
}
