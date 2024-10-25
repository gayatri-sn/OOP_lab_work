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

// Thread to display the maximum value in the matrix
class T3 extends Thread {
    Matrix matrix;

    T3(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        int max = matrix.arr[0][0];
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                if (matrix.arr[i][j] > max) {
                    max = matrix.arr[i][j];
                }
            }
        }
        System.out.println("Maximum element in the matrix: " + max);
    }
}

// Thread to display the principal diagonal elements
class T4 extends Thread {
    Matrix matrix;

    T4(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        System.out.println("Principal diagonal elements:");
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                if (i == j) {
                    System.out.print(matrix.arr[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }
}

// Thread to display the non-diagonal elements
class T5 extends Thread {
    Matrix matrix;

    T5(Matrix matrix) {
        this.matrix = matrix;
    }

    public void run() {
        System.out.println("Non-diagonal elements:");
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.cols; j++) {
                if (i != j) {
                    System.out.print(matrix.arr[i][j] + "\t");
                }
            }
        }
        System.out.println();
    }
}

public class q2 {
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
        T3 c3 = new T3(matrix);
        T4 c4 = new T4(matrix);
        T5 c5 = new T5(matrix);

        try {
            // Start and join threads one by one to avoid mixed outputs
            c1.start();
            c1.join();  // Ensure the matrix is displayed fully

            c2.start();
            c2.join();  // Ensure the transpose is displayed fully

            c3.start();
            c3.join();  // Ensure max element is displayed

            c4.start();
            c4.join();  // Ensure diagonal elements are displayed

            c5.start();
            c5.join();  // Ensure non-diagonal elements are displayed

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
