import java.util.Scanner;

class Student {
    String name;
    int regNo;
    int age;

    static int ugCount = 0;
    static int pgCount = 0;

    Student(String name, int regNo, int age) {
        this.name = name;
        this.regNo = regNo;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Reg No: " + regNo + ", Age: " + age);
    }
}

class UG extends Student {
    int sem;
    int fees;

    UG(String name, int regNo, int age, int sem, int fees) {
        super(name, regNo, age);
        this.sem = sem;
        this.fees = fees;
        Student.ugCount++;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + sem + ", Fees: " + fees);
    }
}

class PG extends Student {
    int sem;
    int fees;

    PG(String name, int regNo, int age, int sem, int fees) {
        super(name, regNo, age);
        this.sem = sem;
        this.fees = fees;
        Student.pgCount++;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + sem + ", Fees: " + fees);
    }
}

public class Details {
    public static void main(String[] args) {
        UG[] ugs = new UG[10];
        PG[] pgs = new PG[10];
        int ugInd = 0, pgInd = 0;
        Scanner sc = new Scanner(System.in);
        int ch;

        while (true) {
            System.out.println("Enter 1 for UG admission, 2 for PG admission, 3 to quit:");
            ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                System.out.println("Enter name, registration number, age, semester, and fees for UG student:");
                String name = sc.nextLine();
                int regNo = sc.nextInt();
                int age = sc.nextInt();
                int sem = sc.nextInt();
                int fees = sc.nextInt();
                sc.nextLine();
                ugs[ugInd] = new UG(name, regNo, age, sem, fees);
                ugInd++;
            } else if (ch == 2) {
                System.out.println("Enter name, registration number, age, semester, and fees for PG student:");
                String name = sc.nextLine();
                int regNo = sc.nextInt();
                int age = sc.nextInt();
                int sem = sc.nextInt();
                int fees = sc.nextInt();
                sc.nextLine();
                pgs[pgInd] = new PG(name, regNo, age, sem, fees);
                pgInd++;
            } else if (ch == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("UG Students:");
        for (int i = 0; i < ugInd; i++) {
            ugs[i].displayDetails();
            System.out.println();
        }
        System.out.println("Total number of UG admissions: " + Student.ugCount);

        System.out.println("PG Students:");
        for (int i = 0; i < pgInd; i++) {
            pgs[i].displayDetails();
            System.out.println();
        }
        System.out.println("Total number of PG admissions: " + Student.pgCount);

        sc.close();
    }
}
