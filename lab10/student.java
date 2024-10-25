import java.util.*;

class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[3];
        int[] roll = new int[3];
        int[][] marks = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            double per = 0; // Reset percentage for each student
            
            // Input name and roll number
            System.out.println((i + 1) + " enter the name:");
            name[i] = sc.nextLine();
            
            System.out.println((i + 1) + " enter the roll number:");
            roll[i] = sc.nextInt();
            
            // Input marks
            System.out.println("Enter the marks of 3 subjects out of 100:");
            for (int k = 0; k < 3; k++) {
                try {
                    marks[i][k] = sc.nextInt();
                    if (marks[i][k] < 0 || marks[i][k] > 100) {
                        throw new Exception("Marks should be between 0 and 100.");
                    }
                    per += marks[i][k]; // Accumulate marks for percentage
                } catch (Exception e) {
                    System.out.println("Invalid marks! " + e.getMessage());
                    sc.nextLine(); // Clear buffer in case of wrong input
                    break;
                }
            }
            
            sc.nextLine(); // Clear newline from buffer after nextInt()
            
            // Calculate percentage
            per = per / 3;
            
            // Determine grade
            char grade;
            if (per >= 85) {
                grade = 'A';
            } else if (per >= 70) {
                grade = 'B';
            } else if (per >= 55) {
                grade = 'C';
            } else if (per >= 35) {
                grade = 'D';
            } else if (per >= 18) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            // Output results
            System.out.println("\nStudent " + (i + 1) + " Details:");
            System.out.println("Name: " + name[i]);
            System.out.println("Roll Number: " + roll[i]);
            System.out.println("Percentage: " + per + "%");
            System.out.println("Grade: " + grade + "\n");
        }
        
        sc.close();
    }
}
