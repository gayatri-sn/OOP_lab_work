import java.util.*;

class Trial implements Runnable {
    public void run() {
        System.out.println("Runnable interface thread created");
        
    }
}

class World extends Thread {
    public void run() {
        System.out.println("Inheriting thread class created");
        
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        try {
            
       
        while (true) {
            System.out.println("\nCreate thread through: ");
            System.out.println("1. Runnable interface");
            System.out.println("2. Inheriting thread class");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            c = sc.nextInt();
            sc.nextLine();
            switch (c) {
                case 1:
                    // Create thread using Runnable interface
                    Trial t = new Trial();
                    Thread z = new Thread(t);
                    z.start();
                    z.join();
                    break;

                case 2:
                    // Create thread by inheriting Thread class
                    World w = new World();
                    w.start();
                    w.join();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;  // Exit the program

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    } catch (InterruptedException e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}}
