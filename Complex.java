import java.util.Scanner;

public class Complex {
    private int real;
    private int imaginary;
    
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public Complex add(int real, Complex c) {
        return new Complex(real + c.real, c.imaginary);
    }

    public Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first complex number:");
        System.out.print("Real part: ");
        int r1 = sc.nextInt();
        System.out.print("Imaginary part: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter second complex number:");
        System.out.print("Real part: ");
        int r2 = sc.nextInt();
        System.out.print("Imaginary part: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        System.out.print("Enter an integer to add to the second complex number:");
        int realPart = sc.nextInt();

        System.out.print("Complex Number 1: ");
        c1.display();
        System.out.print("Complex Number 2: ");
        c2.display();

        Complex sum1 = c1.add(realPart, c2);
        System.out.print("Sum of integer and Complex Number 2: ");
        sum1.display();

        Complex sum2 = c1.add(c1, c2);
        System.out.print("Sum of Complex Number 1 and Complex Number 2: ");
        sum2.display();

    }
}

