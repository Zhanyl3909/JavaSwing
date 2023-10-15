import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListFrame extends JFrame  implements ListSelectionListener{
    public ListFrame() {
        setTitle("List MVC");
        setSize(400,500);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        wordList = new JList(myModel = new MyListModel());
        scrollPane = new JScrollPane(wordList);
        addButton = new JButton("Add");
        field = new JTextField(10);






        //Create a Panel inside the frame
        JPanel p = new JPanel();
        p.add(scrollPane);
        p.add(addButton);
        p.add(field);



        //add an Action Listener for add Button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myModel.add(field.getText());
                wordList.updateUI();    //Resets the UI property with a value from the current look and feel.
            }
        });


        //to consider
       wordList.addListSelectionListener(this);

        getContentPane().add(p,"South");
        panel = new ListPanel();
        getContentPane().add(p, "Center");


    }

    public void valueChanged(ListSelectionEvent event) {
        JList source = (JList) event.getSource();
        Object[] values = source.getSelectedValues();

        String text = "";
        for(int i=0; i < values.length; i++) {
            String word = (String)values[i];

            text+=word + " ";
        }

        panel.setAttribute(text);

    }




    //local data members
    private ListPanel panel;
    private MyListModel myModel;
    private JButton addButton;
    private JTextField field;
    JScrollPane scrollPane;
    JList wordList;

}
