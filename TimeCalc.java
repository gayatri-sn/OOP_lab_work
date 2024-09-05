import java.util.*;
class Time {
    int hour;
    int minute;
    int second;

    Time(){
        hour = minute = second = 0;
    }

    Time(int h,int min, int sec){
        hour = h;
        minute = min;
        second = sec;
    }

    void display(){
        System.out.println("Time = " +hour +":"+minute+":"+second);
    }

    Time add(Time t1,Time t2){
        int sec = t1.second+t2.second;
        int min = t1.minute+t2.minute;
        int h = t1.hour+t2.hour;

        if(sec>60){
            sec-=60;
            min++;
        }
        if(min>60){
            min-=60;
            h++;
        }
        Time t = new Time(h,min,sec);
        return t;
    }
}
public class TimeCalc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time 1:");
        int h = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        Time t1 = new Time(h,min,sec);
        System.out.println("Enter time 2:");
        int h2 = sc.nextInt();
        int min2 = sc.nextInt();
        int sec2 = sc.nextInt();
        Time t2 = new Time(h2,min2,sec2);
        t1.display();
        t2.display();
        Time t = t1.add(t1,t2);
        t.display();

    }
}
