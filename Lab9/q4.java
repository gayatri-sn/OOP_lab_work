import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        int choice=1,n=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first string");  
        String s1=sc.nextLine();
        System.out.println("enter second string");
        String s2=sc.nextLine();
       while(choice<5)
       {  //menu
        System.out.println("1.Compare 2.Covert_cases 3.Substring_or_Not 4.Replace_substr_with_Hello 6.exit");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: if(n!=s1.compareToIgnoreCase(s2) && s1.length()==s2.length())     //comparing 2 strings
            {
                System.out.println("Both strings are equal");
            }
            else
            {
                System.out.println("Both strings are not  equal");
            }break;
            case 2: if(s1.toLowerCase()==s1){   //convert to upper or lower cases
                     System.out.println(" 1st string in uppercase \t"+s1.toUpperCase());}
                     else {
                     System.out.println(" 1st string in lowercase \t"+s1.toLowerCase());}
                     if(s2.toLowerCase()==s2){
                        System.out.println(" 2nd string in uppercase\t"+s2.toUpperCase());}
                        else {
                        System.out.println(" 2nd string in lowercase\t"+s2.toLowerCase());}
                     break;
            case 3:  s1=s1.toLowerCase();
                     s2=s2.toLowerCase();
                     if(s1.contains(s2))    //checking for substrings
                    {
                      System.out.println("2nd is a substring of first");
                    }
                    else {
                        System.out.println("2nd is not a substring of first");
                     } break;
            case 4: if(s1.contains(s2))  //replace the string with hello
                     {
                         s1=s1.replace(s2, "Hello");
                         System.out.println(s1);
                            break;
                     }         
                     else
                     {
                         System.out.println("2nd is not a substring of first ");
                     }      break;
            case 6: System.out.println("exiting");
                    break;         
            default: System.out.println("Invalid choice");
            break;
            

        }
       }
        
    sc.close();
    }
    
}
