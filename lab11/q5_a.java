class SharedResource {
    // Synchronized method to ensure only one thread can access it at a time
    public synchronized void display(String msg) {
        System.out.print("[");
        System.out.print(msg);
        System.out.println("]");
    }
}

class MyThread1 extends Thread {
    SharedResource resource;

    MyThread1(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.display("Thread-1");
    }
}

class MyThread2 extends Thread {
    SharedResource resource;

    MyThread2(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.display("Thread-2");
    }
}

public class q5_a {
    public static void main(String[] args) {
        SharedResource shared = new SharedResource();
        
        MyThread1 t1 = new MyThread1(shared);
        MyThread2 t2 = new MyThread2(shared);
        
        t1.start();
        t2.start();
    }
}
