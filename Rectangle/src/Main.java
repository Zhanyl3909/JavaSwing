public class Main {
    public static void main(String[] args) {

        //create Rectangle objects
        MyRectangle r1 = new MyRectangle(1,1,4,4);
        MyRectangle r2 = new MyRectangle(2,3,5,6);


        //invoke Rectangle methods
        MyRectangle union = r1.union(r2);
        MyRectangle i = r1.intersect(r2);

        if(union.isInside(r2.x1, r2.y1)) {
            System.out.println("(" + r2.x1 + ", " + r2.y1 +
                    ") is inside the union");
        }
        
    }
}
