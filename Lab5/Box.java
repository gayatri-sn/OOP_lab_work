import java.util.*;
class Box{
    double width;
    double height;
    double depth;

    Box(double w,double h,double d ){
        System.out.println("Constructing box...");
        width = w;
        height = h;
        depth = d;
    }

    double volume(){
        return width*height*depth;
    }
}
public class BoxVolCalc{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter width of box:");
    Double w = sc.nextDouble();
    System.out.println("Enter height of box:");
    Double h = sc.nextDouble();
    System.out.println("Enter depth of box:");
    Double d = sc.nextDouble();
    Box box1 = new Box(w,h,d);
    double vol = box1.volume();
    System.out.println("Volume = "+vol);
    sc.close();
    }
}
