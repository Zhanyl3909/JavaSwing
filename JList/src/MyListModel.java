import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.Vector;


//List -> listModel
public class MyListModel implements ListModel {
    Vector list = new Vector();

    MyListModel() {
        list.add("quick");
        list.add("brown");
        list.add("hungry");
        list.add("wild");
        list.add("silent");
    }


    @Override
    public int getSize() {
        return list.size();   //returns the size of the Vector list;
    }

    @Override
    public Object getElementAt(int index) {
        return list.elementAt(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }


    //add function made by me
    public void add(String s) {
        list.add(s);
    }



}
