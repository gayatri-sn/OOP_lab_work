import java.util.Scanner;
public class string3 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n=0,k=0;
        StringBuffer sb=new StringBuffer();
        System.out.println("enter the string");
        String s1=sc.nextLine();
        sb.append(s1); //convert str to strbuffer
        sb.reverse();  //reverse string
        StringBuffer sb1=new StringBuffer();
        sb1.append(s1);  //store the original string
        int choice=1;
       while(choice<5)
       { //menu
        System.out.println("1.Palindrome 2.Alphabetical order 3.Reverse 4.concat 6.exit");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: if(n==sb.compareTo(sb1))  
                    {
                     System.out.println("Its a palindrome");
                     }
                    else
                     {
                         System.out.println("Its not a palindrome");
                    }break;
            case 2: char c[]=s1.toCharArray();  //alphabetical
            char result[]=new char[s1.length()];
                    s1.toLowerCase();
                    for(int i='a';i<='z';i++)
                    {
                        for(int j=0;j<s1.length();j++)  //traverse
                        {
                            if(c[j]==i)
                            {
                                  result[k++]=c[j];
                            }
                        }
                    }
                    String s5=new String(result);
                    System.out.println(s5);
                    break;
            case 3: System.out.println("The reversed string is : "+sb); break;
            case 4:  String s2=sb.toString();
                    String s3=s1.concat(s2);
                    System.out.println("After concatination\t"+s3);
                    break;
            case 6: System.out.println("exiting..");
                    break;         
            default: System.out.println("Invalid choice");
            break;

                    

        }
      
       }
    }
   
}
