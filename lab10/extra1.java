import java.util.*;
class Input_Exception extends Exception
{
    public Input_Exception (String Mes )
    { super(Mes);}
}
class extra1
{
    public static int  eException(Scanner sc) throws Input_Exception
    {
          if(sc.hasNextInt())
          {
            return sc.nextInt();
          }
          else
          {
            sc.next();
            throw new Input_Exception("float numbers are not allowed");
            
          }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,n=0;
        do {
            System.out.println("enter a number and -1 to stop");
            try {
                
             n=eException(sc);
             if(n!=-1)
             {
                sum+=n;
             }
             
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }

            
        } while (n!=-1);
        System.out.println("the sum ="+sum);
    }
}
