import java.util.*;
public class sqrt {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n<0)
        {
            try
            {
                double ans=-1*(n);
                ans=Math.sqrt(ans);
                System.out.println("the answer="+ans+"i");
            }
            catch(Exception e)
            {
                 System.out.println("exception caught");
            }
        }
        else
        {
            double ansn=Math.sqrt(n);
            System.out.println("answer is"+ansn);
        }
    }
}
