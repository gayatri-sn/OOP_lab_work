import java.util.*;
public class displayerror {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number between 1 to 50");
        int r=sc.nextInt();
       
        
            try
            {   //check the number
                if(r>=1 && r<=50)
                {
                    throw new Exception("valid number");
                }
                System.out.println("not in the range");

            }
            catch(Exception e)
            {
                 System.out.println(e.getMessage());
            }
        
       
    }
}
