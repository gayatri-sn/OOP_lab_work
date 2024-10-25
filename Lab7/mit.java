import java.util.*;
class student_details
{
    int id;
    String name;
    final String clg_name="MIT";
    student_details()
    {
        this.id=0;
        
    }
    student_details(String name,int id)  //constructors to initialize
    {
        this.id=id;
        this.name=name;
        
    }
    void display()//display each student details
    {
       System.out.println("Name:"+name+"\tID:"+id+"\tclg_name:"+clg_name);
    }
}
public class mit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name");
        String name =sc.nextLine();
        System.out.println("enter the id");
        int id1=sc.nextInt();
        sc.nextLine();
       //2nd student
        System.out.println("enter the name 2");
        String name1 =sc.nextLine();
        System.out.println("enter the id 2");
        int id2=sc.nextInt();
        //initialize 1st student
        student_details s1=new student_details(name,id1);
        
        //initialize 2nd student
        student_details s2=new student_details(name1,id2);
       
        s1.display();
        s2.display();
        sc.close();
    }
        
}
