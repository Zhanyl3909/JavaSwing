import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyPanel extends JPanel
        implements MouseMotionListener {
    public MyPanel() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                if(e.getClickCount()>=2) {
                    remove(current);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                current =  find(x,y);
                if(current < 0)  //not inside the square
                    add(x,y);
            }
        });

        addMouseMotionListener(this);

        }

        public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i<nsquares; i++) {
            draw(g,i);
        }


    }





    //Interface method implementations
    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if(current >= 0) {
            Graphics g = getGraphics();
            g.setXORMode(getBackground());
            draw(g, current);

            squares[current].x = x;
            squares[current].y = y;
            draw(g, current);
            g.dispose();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if(find(x,y) >= 0)
            setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        else
            setCursor(Cursor.getDefaultCursor());
    }






    //Draw method created by me
    public void draw(Graphics g, int i) {
        g.drawRect(squares[i].x - SQUARELENGTH / 2,
                squares[i].y - SQUARELENGTH / 2,
                SQUARELENGTH,
                SQUARELENGTH);
    }


    //Find method create by me
    public int find(int x, int y) {
        int i;
        for (i = 0; i < nsquares; i++)
            if (squares[i].x - SQUARELENGTH / 2 <= x &&
                    x <= squares[i].x + SQUARELENGTH / 2
                    && squares[i].y - SQUARELENGTH / 2 <= y
                    && y <= squares[i].y + SQUARELENGTH / 2)
            return i;


        return -1;
    }

    public void remove(int n) {
        if(n<0 || n > nsquares) return;
        nsquares--;
        squares[n] = squares[nsquares];
        if (current == 1) current = -1;
        repaint();
    }

    //Add method Created by me
    public void add(int x, int y) {
        if(nsquares < MAXNSQUARES) {
            squares[nsquares] = new Point(x,y);
            current = nsquares;
            nsquares++;
            repaint();
        }
    }


    //data members
    private static final int SQUARELENGTH = 10;
    private static final int MAXNSQUARES = 100;
    private Point[] squares = new Point[MAXNSQUARES];
    private int nsquares = 0;
    private int current = -1;
}
