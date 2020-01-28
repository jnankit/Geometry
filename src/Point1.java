import java.util.*;

public class Point1 {

    static double getperimeter(Point[] array , int n){
        double peri=array[0].getDist(array[n-1]);
        for(int i=0;i<n-1;i++){
            peri = peri + array[i+1].getDist(array[i]);
        }
        return peri;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of points ");
        n= sc.nextInt();


        Point[] array = new Point[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Coordinates of " + (i+1) + "th point");
            int ax = sc.nextInt();
            int ay = sc.nextInt();
            array[i] = new Point(ax,ay);
        }

        //array[1].set_co(56,87);

        for(int i=0;i<n;i++){
            System.out.println(array[i].get_x() + "," + array[i].get_y());
        }
        System.out.println("Perimeter is " + getperimeter(array,n));

        Point p = new Point(0,0);
        Point q = new Point(3,0);
        double re = p.getDist(q);
        System.out.println(re);

    }
}
