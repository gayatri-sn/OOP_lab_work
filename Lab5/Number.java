import java.util.Scanner;

public class Number {
    private double value;

    
    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        int sum = 0, temp = (int) value;
        int digits = String.valueOf(temp).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double value = sc.nextDouble();
        Number num = new Number(value);

        System.out.println("Is Zero: " + num.isZero());
        System.out.println("Is Positive: " + num.isPositive());
        System.out.println("Is Negative: " + num.isNegative());
        System.out.println("Is Odd: " + num.isOdd());
        System.out.println("Is Even: " + num.isEven());
        System.out.println("Is Prime: " + num.isPrime());
        System.out.println("Is Armstrong: " + num.isArmstrong());

    }
}
