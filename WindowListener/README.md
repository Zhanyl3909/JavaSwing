# Window Listener

In Java Swing, a `WindowListener` is an interface that provides methods to handle events associated with windows, such as opening, closing, and minimizing. To use a `WindowListener`, you must implement all of its methods, even if you only intend to use some of them.

Here is an example of how to implement a `WindowListener` in Java:

```java
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements WindowListener {
    public MyFrame() {
        // Set up the frame
        this.setTitle("My Frame");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Add the WindowListener
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // Handle the window closing event
            }
        });

        // Show the frame
        this.setVisible(true);
    }

    // Implement the WindowListener methods
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
}

```

In this example, `MyFrame` is a subclass of `JFrame` that implements the `WindowListener` interface. The `windowClosing` method is overridden to handle the event when the user tries to close the window. Note that we also add a `WindowAdapter` to the frame, which provides default implementations for all of the `WindowListener` methods. We only override the `windowClosing` method in this example.

By using a `WindowListener`, you can add custom behavior to your Java Swing application in response to window events.

## Event Handler in Java Swing

An event handler is a method in a Java Swing application that is executed in response to a specific event, such as a button click or a key press. In Swing, event handlers are typically implemented using interfaces, such as `ActionListener` and `MouseListener`.

To create an event handler, you first need to define a method that will handle the event. This method should take an event object as its parameter, and should contain the code that you want to execute in response to the event.

For example, to handle a button click event, you could define an `actionPerformed` method like this:

```java
public void actionPerformed(ActionEvent e) {
    // Handle the button click event
}

```

Once you have defined your event handler method, you need to register it with the appropriate component using a method like `addActionListener` or `addMouseListener`. This tells Swing to call your event handler method in response to the specified event.

For example, to register an `actionPerformed` method with a button, you could use code like this:

```java
JButton button = new JButton("Click me");
button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Handle the button click event
    }
});

```

By using event handlers, you can add interactivity to your Java Swing application and respond to user input in real time.

## Anonymous Object with Window Adapter

### I**ntroduction**

The class **WindowAdapter** is an abstract (adapter) class for receiving window events. All methods of this class are empty. This class is convenience class for creating listener objects.

### **Class Declaration**

Following is the declaration for **java.awt.event.WindowAdapter** class −

```
public abstract class WindowAdapter
   extends Object
      implements WindowListener, WindowStateListener, WindowFocusListener

```

```java
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends JFrame {
    MyFrame() {

        setSize(300,200);
        setTitle("Window");
        setLocation(200,200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("Closing");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

    }
}
```
