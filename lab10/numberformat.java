import java.util.*;
class numberformat
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        
        try {
            System.out.println("enter an integer");
          // Parsing user input to integer
           // using the parseInt() method
            int no=Integer.parseInt(sc.next());
            // If number is valid, print and display
            System.out.println("you have entered"+no);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Number format exception has occurred");
        }
    }
}
