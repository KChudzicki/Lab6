import java.awt.*;

public class RefTester {
    public static void main(String[] args) {

        Point pt1, pt2;
        pt1 = new Point(100,100);
        pt2 = pt1; // mamy tylko jeden obiekt, mamy dwiereferencjie do  tego samego obiektu

        pt1.x = 200;
        pt1.y =200;

        System.out.println(pt1);
        System.out.println(pt2);


    }
        }
