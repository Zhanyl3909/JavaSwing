public class MyRectangle {


    //data fields of the class
    public int x1,y1,x2,y2;   //may not specify public is a default

    //constructor (Purpose of this Constructor is to initialize each of the fields of the new Object)
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;  //this.x - is data field of this class, x1 is new field
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    //this is another constructor, it defines itself in terms of above
    public MyRectangle(int width, int height) {
        this(0,0,width,height);
    }


    //this is yet another constructor
    public MyRectangle() {
        this(0, 0, 0, 0);
    }



    //Move the rectangle by the specified amounts
    public void move(int deltax, int delftay) {
        x1+=deltax;
        y1+=delftay;

        x2+=deltax;
        y2+=delftay;
    }


    //this whether specified point is inside the rect
    public boolean isInside(int x, int y) {
        return ((x>=x1) && (x<=x2) && (y>=y1) && (y<= y2));
    }


    public MyRectangle union(MyRectangle r) {
        return new MyRectangle((this.x1 < r.x1) ? this.x1 : r.x1,
                               (this.y1 < r.y1) ? this.y1 : r.y1,
                               (this.x2 > r.x2) ? this.x2 : r.x2,
                               (this.y2 > r.y2) ? this.y2 : r.y2);
    }



    //return the intersection of this rectangle with another
    public MyRectangle intersect(MyRectangle r) {
        MyRectangle res = new MyRectangle(
                (this.x1 > r.x1) ? this.x1 : r.x1,
                (this.y1 > r.y1) ? this.y1 : r.y1,
                (this.x2 < r.x2) ? this.x2 : r.x2,
                (this.y2 < r.y2) ? this.y2 : r.y2);

        if(res.x1 > res.x2) {
            res.x1 = res.x2 = 0;
        }
        if(res.y1 > res.y2) {
            res.y1 = res.y2 = 0;
        }
        return res;
    }





    //this method of superclass, Object;

    @Override
    public String toString() {
        return "[" + x1 + ", " + y1 + "; " + x2 + ", " + y2 + "]";
    }

}
