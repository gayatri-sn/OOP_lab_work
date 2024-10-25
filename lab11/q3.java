import java.util.*;

class Matrix {
    int[][] arr;
    int rows, cols;

    // Constructor to initialize the matrix
    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.arr = new int[rows][cols];
    }

    // Method to fill the matrix with user input
    public void fillMatrix(Scanner sc) {
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}

// Thread to display the matrix
class T1 extends Thread {
    Matrix matrix;

    T1(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        System.out.println("Display matrix:");
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                System.out.print(matrix.arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

// Thread to display the transpose of the matrix
class T2 extends Thread {
    Matrix matrix;

    T2(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < matrix.cols; i++) {
            for (int j = 0; j < matrix.rows; j++) {
                System.out.print(matrix.arr[j][i] + "\t");
            }
            System.out.println();
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for a square matrix:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns for a square matrix:");
        int cols = sc.nextInt();

        Matrix matrix = new Matrix(rows, cols);
        matrix.fillMatrix(sc);

        // Create threads
        T1 c1 = new T1(matrix);
        T2 c2 = new T2(matrix);

        // Start the threads
        c1.start();
        

        // Demonstrating isAlive() and join()
        try {
            // Checking the status of the first thread with isAlive()
            if (c1.isAlive()) {
                System.out.println("Thread T1 is still running...");
            }

            // Wait for thread T1 to complete
            c1.join();
            System.out.println("Thread T1 has finished.");
            c2.start();
            // Now check the status of the second thread
            if (c2.isAlive()) {
                System.out.println("Thread T2 is still running...");
            }

            // Wait for thread T2 to complete
            c2.join();
            System.out.println("Thread T2 has finished.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
