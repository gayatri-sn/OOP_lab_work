class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " with priority " + getPriority() + ": " + i);
                Thread.sleep(300);  // Simulate some work
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted!");
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("High Priority Thread");

        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        t1.start();
        t2.start();

        // Interrupt the low-priority thread after some time
        try {
            Thread.sleep(500);  // Let threads run for a bit
            t1.interrupt();      // Interrupt t1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
