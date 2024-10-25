
import java.util.*;

class outofbounds {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int le = 0, ch = 0;

        while (ch<3) {  // Loop will continue until the user chooses to exit
            System.out.println("1. Add 2.  Display 3. Exit");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    try {
                        System.out.println("Enter the element:");
                        arr[le++] = sc.nextInt();
                        System.out.println("Added successfully");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Array Index out of bounds exception has occurred");
                        le--; // Adjust the index back since the addition failed
                    }
                    break;

                case 2:
                    System.out.println("Array contents:");
                    for (int i = 0; i < le; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                    System.out.println(); // Move to next line after displaying
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }
    }
}
