import java.util.*;
public class squarematrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows of the matrix");
        int r=sc.nextInt();
        System.out.println("enter the number of coloums of the matrix");
        int c=sc.nextInt();
        
            try
            {   //check the rows and coloums
                if(r!=c)
                {
                    throw new Exception("not a square matrix");
                }
                System.out.println("it is a square matrix");
            }
            catch(Exception e)
            {
                 System.out.println(e.getMessage());
            }
        
       
    }
}
