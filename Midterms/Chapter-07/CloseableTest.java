//Main Java

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new MyFrame();
    frame.show();
  }
}


//MyFrame Java Class
import java.swing.*;
import java.awt.WindowAdapter;
import java.awt.WindowEvent;

public class MyFrame extends JFrame {
  public MyFrame() {
    setTitle("Closeable Test");
    setSize(500,600);
    setVisabel(true);

  addWindowListener(new WindowAdapter() {
    @Override
    public void WindowClsoing(WindowEvent e) {
      System.exit(0);
    }
  });
    
  }
}



/*
- JFrame interface
- WindowListener
- WindowEvent

*/
