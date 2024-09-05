import java.util.*;
class Employee{
    String name;
    String city;
    float basic;
    float da;
    float hra;


    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("City: ");
        city = sc.nextLine();
        System.out.println("basic salary: ");
        basic = sc.nextFloat();
        System.out.println("DA%: ");
        da = sc.nextFloat();
        System.out.println("HRA%: ");
        hra = sc.nextFloat();
        sc.close();

        }
        float calculate(){
            float total = basic+basic*da/100+basic*hra/100;
            return total;
        }
        void display(){
            System.out.println("Total = "+calculate());
        }

}
public class Company{
    public static void main(String args[]){
        Employee emp = new Employee();
        emp.getData();
        emp.display();
    }
}

